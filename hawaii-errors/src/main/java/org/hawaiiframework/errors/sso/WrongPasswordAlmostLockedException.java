package org.hawaiiframework.errors.sso;

import org.hawaiiframework.errors.ErrorCode;
import org.hawaiiframework.exception.ApiException;

/**
 * Exception thrown when a user fills in a wrong password for the second time.
 */
public class WrongPasswordAlmostLockedException extends ApiException {

    /**
     * Generated by IntelliJ IDEA.
     */
    private static final long serialVersionUID = -1760507235375683002L;

    /**
     * Constructor.
     */
    public WrongPasswordAlmostLockedException() {
        super(ErrorCode.WRONG_PASSWORD_ONE_ATTEMPT_REMAINING);
    }
}