package com.mongodb;

/**
 * Options related to insertion of documents into MongoDB.  The setter methods return {@code this} so that a chaining style can be used.
 *
 * @since 2.13
 */
public final class InsertOptions {
    private WriteConcern writeConcern;
    private boolean continueOnError;
    private DBEncoder dbEncoder;

    /**
     * Set the write concern to use for the insert.
     *
     * @param writeConcern the write concern
     * @return this
     */
    public InsertOptions writeConcern(final WriteConcern writeConcern) {
        this.writeConcern = writeConcern;
        return this;
    }

    /**
     *  Set whether documents will continue to be inserted after a failure to insert one.
     *
     * @param continueOnError whether to continue on error
     * @return this
     */
    public InsertOptions continueOnError(final boolean continueOnError) {
        this.continueOnError = continueOnError;
        return this;
    }

    /**
     * Set the encoder to use for the documents.
     *
     * @param dbEncoder the encoder
     * @return this
     */
    public InsertOptions dbEncoder(final DBEncoder dbEncoder) {
        this.dbEncoder = dbEncoder;
        return this;
    }

    /**
     * The write concern to use for the insertion.  By default the write concern configured for the DBCollection instance will be used.
     *
     * @return the write concern, or null if the default will be used.
     */
    public WriteConcern getWriteConcern() {
        return writeConcern;
    }

    /**
     * Whether documents will continue to be inserted after a failure to insert one (most commonly due to a duplicate key error).  Note
     * that this only is relevant for multi-document inserts. The default value is false.
     *
     * @return whether insertion will continue on error.
     */
    public boolean isContinueOnError() {
        return continueOnError;
    }

    /**
     * The encoder to use for the documents.  By default the codec configured for the DBCollection instance will be used.
     * @return the encoder, or null if the default will be used
     */
    public DBEncoder getDbEncoder() {
        return dbEncoder;
    }
}
