package com.example.Oauthserver.Token;

import javax.validation.constraints.NotBlank;
public class TokenRefreshRequest {
  @NotBlank
  private String refreshToken;
  public String getRefreshToken() {
    return refreshToken;
  }
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }
}