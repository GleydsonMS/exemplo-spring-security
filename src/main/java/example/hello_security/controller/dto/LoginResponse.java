package example.hello_security.controller.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
}
