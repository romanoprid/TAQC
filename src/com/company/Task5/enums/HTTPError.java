package com.company.Task5.enums;

public enum HTTPError {
  BAD_REQUEST(400),
  UNAUTHORIZED(401),
  PAYMENT_REQUIRED(402),
  FORBIDDEN(403),
  NOT_FOUND(404),
  METHOD_NOT_ALLOWED(405);

  private int id;

  HTTPError(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public static HTTPError idCheck(int id) {
    for (HTTPError type : values()) {
      if (type.getId() == id) {
        return type;
      }

    }

    return null;
  }
}

