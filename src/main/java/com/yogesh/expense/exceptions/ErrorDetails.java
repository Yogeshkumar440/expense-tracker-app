package com.yogesh.expense.exceptions;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Schema(
        description = "ErrorDetails DTO (Date Transfer Object) to transfer error response data between client and server"
)
@Getter
@Setter
public class ErrorDetails {

    @Schema(
            description = "Error occurred date time"
    )
    private LocalDateTime timestamp;

    @Schema(
            description = "Error message"
    )
    private String message;

    @Schema(
            description = "Error details"
    )
    private String details;

    @Schema(
            description = "Error Code"
    )
    private String errorCode;

}
