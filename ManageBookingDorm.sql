USE [master]
GO
IF EXISTS (SELECT name FROM master.dbo.sysdatabases WHERE name = N'ManageBookingDorm')
BEGIN
	DROP DATABASE [ManageBookingDorm];
END
GO
/****** Object:  Database [ManageBookingDorm]    Script Date: 2/24/2022 7:50:06 PM ******/
CREATE DATABASE [ManageBookingDorm]
GO
USE [ManageBookingDorm]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 2/24/2022 7:50:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[username] [nvarchar](255) NULL,
	[password] [nvarchar](255) NULL,
	[displayName] [nvarchar](255) NULL,
	[address] [nvarchar](255) NULL,
	[email] [nvarchar](255) NULL,
	[phone] [nvarchar](255) NULL,
	[role] [nvarchar](50) NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

/****** Object:  Table [dbo].[Category]    Script Date: 2/24/2022 7:50:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Category](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](255) NULL,
 CONSTRAINT [PK_Category] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

/****** Object:  Table [dbo].[BillDetail]    Script Date: 2/24/2022 7:50:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[BillDetail](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[bill_id] [int] NULL,
	[roomName] [nvarchar](255) NULL,
	[roomImage] [nvarchar](255) NULL,
	[roomPrice] [float] NULL,
	[quantity] [int] NULL,
 CONSTRAINT [PK_BillDetail] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

/****** Object:  Table [dbo].[Bills]    Script Date: 2/24/2022 7:50:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Bills](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[account_id] [int] NULL,
	[totalPrice] [float] NULL,
	[note] [text] NULL,
	[created_date] [date] NULL,
	[admissier_id] [int] NULL,
 CONSTRAINT [PK_Bills] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO

/****** Object:  Table [dbo].[Room]    Script Date: 2/24/2022 7:50:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Room](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](255) NULL,
	[duration] [int] NULL,  --thoi han su dung 
	[price] [float] NULL,
	[description] [nvarchar](255) NULL,  --mo ta
	[image_url] [nvarchar](255) NULL,
	[created_date] [date] NULL,
	[category_id] [int] NULL,
 CONSTRAINT [PK_Room] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

/****** Object:  Table [dbo].[Admissier]    Script Date: 2/24/2022 7:50:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Admissier](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](255) NULL,
	[phone] [nvarchar](255) NULL,
	[address] [nvarchar](255) NULL,
 CONSTRAINT [PK_Admissier] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Category] ON 

INSERT [dbo].[Category] ([id], [name]) VALUES (1, N'Room for 2')
INSERT [dbo].[Category] ([id], [name]) VALUES (2, N'Room for 3')
INSERT [dbo].[Category] ([id], [name]) VALUES (3, N'Room for 4')
INSERT [dbo].[Category] ([id], [name]) VALUES (4, N'Room for 6')
INSERT [dbo].[Category] ([id], [name]) VALUES (5, N'Room for 8')

SET IDENTITY_INSERT [dbo].[Category] OFF
GO
SET IDENTITY_INSERT [dbo].[Room] ON 

insert into Room (id, name, duration, price, description, image_url, created_date, category_id) values (1, 'Luisa', 6, 160, 'With this beautiful room, you will comfortably study and live in a quiet but extremely spacious space.', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRG_x0mwArHJZuyD3pq_V1zMu3prE81lyfsforgf7HihGSoFSSAPzeh9NHfTdlIXRLzg1I&usqp=CAU', '2022-06-13', 1);
insert into Room (id, name, duration, price, description, image_url, created_date, category_id) values (2, 'Pierson', 10, 100, 'This room of ours can be considered the largest, and extremely convenient. That is why students who have close friends from before often choose this type of room.', 'https://alibabahome.vn/wp-content/uploads/2018/12/ky-tuc-xa-nu.jpg', '2022-09-02', 5);
insert into Room (id, name, duration, price, description, image_url, created_date, category_id) values (3, 'Baryram', 6, 139, 'This room at our DormBOO is very popular with students, moderate quantity, clean and beautiful.', 'https://trusthome.vn/wp-content/uploads/2020/07/97449274_2667370100174297_4794808357183553536_o.jpg', '2022-09-19', 3);
insert into Room (id, name, duration, price, description, image_url, created_date, category_id) values (4, 'Wilburt', 9, 150, 'A spacious room decorated beautifully but very simply, suitable for students.', 'https://photo-cms-kienthuc.zadn.vn/zoom/800/uploaded/thutrang/2020_10_02/6/loat-ky-tuc-xa-dep-nhu-khach-san-cua-truong-dai-hoc-tai-ha-noi-hinh-5.jpg', '2022-04-02', 2);
insert into Room (id, name, duration, price, description, image_url, created_date, category_id) values (5, 'Gardy', 12, 140, 'It is a popular room, but due to the modern decoration, students often book very early.', 'https://blog.ohanaliving.vn/content/images/2019/10/188cd5f102d1e48fbdc0-1.jpg', '2022-09-06', 3);
insert into Room (id, name, duration, price, description, image_url, created_date, category_id) values (6, 'Suee', 11, 120, 'Belonging to one of the few rooms containing a large number of students, but not so that it loses its cleanliness and convenience.', 'https://file4.batdongsan.com.vn/resize/745x510/2019/03/06/20190306141813-4e0d_wm.jpg', '2021-10-20', 4);
insert into Room (id, name, duration, price, description, image_url, created_date, category_id) values (7, 'Tatum', 6, 144, 'A popular but more modern room type and the students who book this room are mostly rich children', 'https://photo-cms-bizlive.zadn.vn/w1200/Uploaded/2022/athlragunz_ci/2017_08_09/a-tb-san-nha-nat-lam-dorm-2-9055-1502250027_WYOY.jpg', '2022-05-03', 3);
insert into Room (id, name, duration, price, description, image_url, created_date, category_id) values (8, 'Erskine', 9, 125, 'Spacious room, can accommodate 6 students, area with classic and cozy decoration.', 'https://media.viezone.vn/prod/2021/10/3/image_e8ec755c91.png', '2021-10-29', 4);
insert into Room (id, name, duration, price, description, image_url, created_date, category_id) values (9, 'Marge', 8, 152, 'Room type higher level with harmonious decoration, clean. Usually book by students far from home.', 'https://alibabahome.vn/wp-content/uploads/2019/01/ky-tuc-xa-cao-cap-nu-hcm.jpg', '2021-09-19', 2);
insert into Room (id, name, duration, price, description, image_url, created_date, category_id) values (10, 'Reyna', 3, 155, 'The room is spacious and full of convenient equipment to help students study more conveniently.', 'https://s3.ap-southeast-1.amazonaws.com/users.meeyland/articles/20190504180737_adfe.1621166687063.jpg?d=414x188', '2021-03-10', 2);
insert into Room (id, name, duration, price, description, image_url, created_date, category_id) values (11, 'Tokyo', 3, 175, 'Room type with classical decoration, helping students to comfortably study and practice.', 'https://ss-images.saostar.vn/w800/2018/11/22/4106539/img_0687-1.jpg', '2021-01-11', 1);
insert into Room (id, name, duration, price, description, image_url, created_date, category_id) values (12, 'Sysdei', 6, 110, 'A room with a capacity of 8 people but very airy. Here students can do what they dream of.', 'https://cafebiz.cafebizcdn.vn/2017/photo-1-1505131731090.jpg', '2022-02-15', 5);
GO

SET IDENTITY_INSERT [dbo].[Room] OFF
GO
ALTER TABLE [dbo].[BillDetail]  WITH CHECK ADD  CONSTRAINT [FK__BillDetail__bills__30F848ED] FOREIGN KEY([bill_id])
REFERENCES [dbo].[Bills] ([id])
GO
ALTER TABLE [dbo].[BillDetail] CHECK CONSTRAINT [FK__BillDetail__bills__30F848ED]
GO
ALTER TABLE [dbo].[Bills]  WITH CHECK ADD  CONSTRAINT [FK__Bills__account___2F10007B] FOREIGN KEY([account_id])
REFERENCES [dbo].[Account] ([id])
GO
ALTER TABLE [dbo].[Bills] CHECK CONSTRAINT [FK__Bills__account___2F10007B]
GO
ALTER TABLE [dbo].[Bills]  WITH CHECK ADD  CONSTRAINT [FK__Bills__admissier__300424B4] FOREIGN KEY([admissier_id])
REFERENCES [dbo].[Admissier] ([id])
GO
ALTER TABLE [dbo].[Bills] CHECK CONSTRAINT [FK__Bills__admissier__300424B4]
GO
ALTER TABLE [dbo].[Room]  WITH CHECK ADD  CONSTRAINT [FK__Room__categor__267ABA7A] FOREIGN KEY([category_id])
REFERENCES [dbo].[Category] ([id])
GO
ALTER TABLE [dbo].[Room] CHECK CONSTRAINT [FK__Room__categor__267ABA7A]
GO
USE [master]
GO
ALTER DATABASE [ManageBookingDorm] SET  READ_WRITE 
GO
