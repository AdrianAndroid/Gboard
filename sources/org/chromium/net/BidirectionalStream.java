package org.chromium.net;

import java.nio.ByteBuffer;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class BidirectionalStream {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public abstract class Builder {
        public static final int STREAM_PRIORITY_HIGHEST = 4;
        public static final int STREAM_PRIORITY_IDLE = 0;
        public static final int STREAM_PRIORITY_LOW = 2;
        public static final int STREAM_PRIORITY_LOWEST = 1;
        public static final int STREAM_PRIORITY_MEDIUM = 3;

        /* renamed from: addHeader */
        public abstract Builder mo68addHeader(String str, String str2);

        /* renamed from: build */
        public abstract BidirectionalStream mo69build();

        /* renamed from: delayRequestHeadersUntilFirstFlush */
        public abstract Builder mo70delayRequestHeadersUntilFirstFlush(boolean z);

        /* renamed from: setHttpMethod */
        public abstract Builder mo71setHttpMethod(String str);

        /* renamed from: setPriority */
        public abstract Builder mo72setPriority(int i);
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public abstract class Callback {
        public void onCanceled(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        }

        public abstract void onFailed(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, CronetException cronetException);

        public abstract void onReadCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z);

        public abstract void onResponseHeadersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo);

        public void onResponseTrailersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, UrlResponseInfo.HeaderBlock headerBlock) {
        }

        public abstract void onStreamReady(BidirectionalStream bidirectionalStream);

        public abstract void onSucceeded(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo);

        public abstract void onWriteCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z);
    }

    public abstract void cancel();

    public abstract void flush();

    public abstract boolean isDone();

    public abstract void read(ByteBuffer byteBuffer);

    public abstract void start();

    public abstract void write(ByteBuffer byteBuffer, boolean z);
}
