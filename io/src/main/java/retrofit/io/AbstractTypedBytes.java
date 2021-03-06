// Copyright 2010 Square, Inc.
package retrofit.io;

import retrofit.internal.Objects;

import java.io.Serializable;

/**
 * Support for Typed values.
 *
 * @author Bob Lee (bob@squareup.com)
 */
public abstract class AbstractTypedBytes implements TypedBytes, Serializable {
  private static final long serialVersionUID = 0;

  private final MimeType mimeType;

  /**
   * Stores the mime type.
   *
   * @throws NullPointerException if mimeType is null
   */
  public AbstractTypedBytes(MimeType mimeType) {
    this.mimeType = Objects.nonNull(mimeType, "mimeType");
  }

  public MimeType mimeType() {
    return mimeType;
  }

  /** Returns the length in bytes. */
  public abstract int length();
}