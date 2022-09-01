package defpackage;

import java.io.InputStream;
import java.lang.reflect.Constructor;

/* compiled from: PG */
/* renamed from: kne  reason: default package */
/* loaded from: classes.dex */
public final class kne {
    public static final ltg a = ltg.j("com/google/android/libraries/speech/encoding/AudioEncodingUtils");
    public static Constructor b;

    private kne() {
    }

    public static InputStream a(InputStream inputStream, int i, int i2, int i3) {
        return new kni(inputStream, i2, i, i3);
    }
}
