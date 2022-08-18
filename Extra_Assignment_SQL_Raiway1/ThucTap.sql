create database if not exists ThucTap;
use ThucTap;
create table Khoa (
	makhoa		char(10) primary key,
    tenkhoa 	char(30),
    dienthoai	char(10)
);
create table GiangVien (
	magv 		int primary key,
    hotengv		char(30),
    luong 		decimal(5,2),
    makhoa		char(10),
    foreign key (makhoa) references Khoa(makhoa)
);
create table SinhVien (
	masv		int primary key,
    hotensv		char(30),
    makhoa		char(10),
    namsinh		int,
    quequan		char(30),
    foreign key (makhoa) references Khoa(makhoa)
);
create table DeTai (
	madt		char(10) primary key,
    tendt		char(30),
    kinhphi		int,
    NoiThucTap	char(30)
);
create table HuongDan(
	masv		int primary key,
    madt		char(10),
    magv		int,
    ketqua		decimal(5,2),
    foreign key (madt) references DeTai(madt),
	foreign key (magv) references GiangVien(magv),
    foreign key (masv) references SinhVien(masv)
);

insert into Khoa(makhoa, tenkhoa, dienthoai)
values	(1,'Dia Ly', 'SDT1'),
		(2,'QLTN','SDT2'),
        (3,'TOAN','SDT3'),
        (4,'Cong Nghe Sinh Hoc','SDT4'),
        (5,'Hoa Hoc','SDT5');
select * from Khoa;

insert into GiangVien(magv, hotengv, luong, makhoa)
values	(1, 'Nguyen Thanh Hoa',100,1),
		(2, 'Nguyen Thu Ha',200,2),
        (3, 'Nguyen Thi Hong',250,3),
        (4, 'Nguyen Tung',500,4),
        (5, 'Nguyen Van Hai',400,5);
select * from GiangVien;

insert into SinhVien(masv, hotensv, makhoa, namsinh, quequan)
values	(1,'Nguyen Ngoc Son', 1, 1995, 'Ha Noi'),
		(2,'Le Van Son', 2, 2000, 'Bac Ninh'),
        (3,'Tran Son', 3, 1995, 'Ha Nam'),
        (4,'Nguyen Van Hung', 4, 1998, 'Bac Giang'),
        (5,'Duong Xuan Bao', 5, 1993, 'Vinh Phuc');
select * from SinhVien;

insert into DeTai(madt, tendt, kinhphi, NoiThucTap)
values	(1, 'Nha thong minh',1000, 'Cong ty Bac Ninh'),
		(2, 'Thang may',1500, 'Cong ty duoc pham ha nam'),
        (3, 'Thiet ke he thong',1000, 'Cong ty Ha noi');
select * from DeTai;

insert into HuongDan(masv, madt, magv, ketqua)
values	(1,1,1,8),
		(2,1,2,7),
        (3,2,3,9),
        (4,3,4,8),
        (5,2,5,10);

-- Question1
select magv, hotengv, tenkhoa 
from GiangVien
inner join Khoa ON GiangVien.makhoa = Khoa.makhoa;
