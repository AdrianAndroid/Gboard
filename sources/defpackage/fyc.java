package defpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: PG */
/* renamed from: fyc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fyc implements mma {
    private final /* synthetic */ int d;
    public static final /* synthetic */ fyc c = new fyc(2);
    public static final /* synthetic */ fyc b = new fyc(1);
    public static final /* synthetic */ fyc a = new fyc(0);

    private /* synthetic */ fyc(int i) {
        this.d = i;
    }

    @Override // defpackage.mma
    public final HttpURLConnection a(String str) {
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                return (HttpURLConnection) new URL(str).openConnection();
            }
            throw new IOException("HTTP support disabled!");
        }
        throw new IOException("HttpURLConnectionFactory failed to load!");
    }
}
