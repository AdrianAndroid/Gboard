package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: oxl  reason: default package */
/* loaded from: classes2.dex */
public final class oxl extends UrlRequest.StatusListener {
    private final UrlRequest.StatusListener a;

    public oxl(UrlRequest.StatusListener statusListener) {
        this.a = statusListener;
    }

    @Override // org.chromium.net.UrlRequest.StatusListener
    public final void onStatus(int i) {
        this.a.onStatus(i);
    }
}
