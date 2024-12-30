package com.shikhar.bittrade.modal;

import com.shikhar.bittrade.domain.VerificationType;
import lombok.Data;

@Data
public class TwoFactorAuth {
    private boolean isEnabled = false;
    private VerificationType sendTo;
}
