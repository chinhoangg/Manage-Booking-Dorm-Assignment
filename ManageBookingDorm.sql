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

insert into Room (id, name, duration, price, description, image_url, created_date, category_id) values (1, 'Luisa', 6, 9703292, 'Diabetes due to underlying condition w hyprosm w coma', 'http://dummyimage.com/250x.png/cc0000/ffffff', '2022-06-13', 3);
insert into Room (id, name, duration, price, description, image_url, created_date, category_id) values (2, 'Pierson', 10, 3176481, 'Oth malignant neoplasm of skin of other parts of face', 'http://dummyimage.com/250x.png/5fa2dd/ffffff', '2022-09-02', 4);
insert into Room (id, name, duration, price, description, image_url, created_date, category_id) values (3, 'Baryram', 6, 5024813, 'Congenital deformity of spine', 'http://dummyimage.com/250x.png/ff4444/ffffff', '2022-09-19', 2);
insert into Room (id, name, duration, price, description, image_url, created_date, category_id) values (4, 'Wilburt', 9, 5684847, 'Decreased fetal movements, third trimester, other fetus', 'http://dummyimage.com/250x.png/ff4444/ffffff', '2022-04-02', 2);
insert into Room (id, name, duration, price, description, image_url, created_date, category_id) values (5, 'Gardy', 12, 6792520, 'Unsp fracture of left forearm, init for opn fx type I/2', 'http://dummyimage.com/250x.png/cc0000/ffffff', '2022-09-06', 2);
insert into Room (id, name, duration, price, description, image_url, created_date, category_id) values (6, 'Sue', 11, 3071533, 'Disorder of patella', 'http://dummyimage.com/250x.png/ff4444/ffffff', '2021-10-20', 2);
insert into Room (id, name, duration, price, description, image_url, created_date, category_id) values (7, 'Tatum', 6, 4159526, 'Burn of first degree of right hand, unsp site, init encntr', 'http://dummyimage.com/250x.png/cc0000/ffffff', '2022-05-03', 3);
insert into Room (id, name, duration, price, description, image_url, created_date, category_id) values (8, 'Erskine', 9, 3039101, 'Oth congenital malformations of circulatory system', 'http://dummyimage.com/250x.png/5fa2dd/ffffff', '2021-10-29', 4);
insert into Room (id, name, duration, price, description, image_url, created_date, category_id) values (9, 'Marge', 8, 3833871, 'Other injury of heart without hemopericardium, init encntr', 'http://dummyimage.com/250x.png/5fa2dd/ffffff', '2021-09-19', 3);
insert into Room (id, name, duration, price, description, image_url, created_date, category_id) values (10, 'Reyna', 3, null, 'Lac w/o fb of r mid finger w/o damage to nail, sequela', 'http://dummyimage.com/250x.png/ff4444/ffffff', '2021-03-10', 2);
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
