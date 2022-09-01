package defpackage;

import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: PG */
/* renamed from: odj  reason: default package */
/* loaded from: classes2.dex */
public final class odj {
    public static final odg a = new odi(new byte[0], 0, 0);

    public static String a(odg odgVar, Charset charset) {
        jdg.Q(charset, "charset");
        int f = odgVar.f();
        byte[] bArr = new byte[f];
        odgVar.k(bArr, 0, f);
        return new String(bArr, charset);
    }

    public static InputStream b(odg odgVar) {
        return new odh(odgVar);
    }
}
