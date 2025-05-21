# Unit Test - Student Analyzer

## Mô tả bài toán

Chương trình cung cấp 2 hàm chính trong lớp `StudentAnalyzer`:

- `countExcellentStudents(List<Double> scores)`: Đếm số học sinh có điểm xuất sắc (từ 8.0 đến 10.0).
- `calculateValidAverage(List<Double> scores)`: Tính điểm trung bình của các điểm hợp lệ (từ 0.0 đến 10.0).

Điểm không hợp lệ (ngoài khoảng 0 - 10) sẽ bị bỏ qua khi tính trung bình và đếm.

## Cấu trúc thư mục

- `src/main` chứa mã nguồn Java (`StudentAnalyzer.java`).
- `src/test/` chứa file test JUnit (`StudentAnalyzerTest.java`).

## Cách chạy chương trình

### 1. Chuẩn bị môi trường

- Cài đặt JDK (phiên bản 8 trở lên).
- Cài đặt Maven.

### 2. Biên dịch mã nguồn

javac -d out -cp . src/com/example/unit_test_DuongThiBichVan/StudentAnalyzer.java

### 3. Chạy test JUnit

mvn test
