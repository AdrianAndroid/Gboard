package defpackage;

/* compiled from: PG */
/* renamed from: pbi  reason: default package */
/* loaded from: classes2.dex */
public final class pbi {
    public static final int a;

    static {
        int i;
        try {
            i = ((Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue();
        } catch (Exception unused) {
            i = 0;
        }
        a = i;
    }
}
