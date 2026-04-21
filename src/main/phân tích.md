Tách biệt logic và cấu hình: 
Code Java tập trung xử lý nghiệp vụ, còn thông số cấu hình nằm ngoài để dễ quản lý.

Dễ bảo trì và thay đổi:
Khi cần đổi tên bệnh viện hoặc số hotline, chỉ cần chỉnh file cấu hình mà không phải biên dịch lại toàn bộ ứng dụng.

Tái sử dụng và linh hoạt: 
Có thể dùng cùng một code nhưng thay đổi cấu hình cho nhiều môi trường (dev, test, production).

Bảo mật và quản lý tập trung: 
Các thông số nhạy cảm (API key, mật khẩu, số hotline nội bộ) có thể quản lý tập trung trong file cấu hình hoặc thông qua hệ thống quản lý cấu hình.

Hỗ trợ DevOps: 
Dễ dàng tích hợp CI/CD khi triển khai ứng dụng, chỉ cần thay đổi file cấu hình theo môi trường.