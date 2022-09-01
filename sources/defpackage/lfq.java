package defpackage;

import java.security.SecureRandom;
import java.util.Random;

/* compiled from: PG */
/* renamed from: lfq  reason: default package */
/* loaded from: classes.dex */
public final class lfq {
    public static final Random a = new lfo();
    public static final ThreadLocal b = new lfn();

    static {
        a();
        new lfp();
    }

    public static SecureRandom a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
