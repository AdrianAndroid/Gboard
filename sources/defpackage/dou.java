package defpackage;

/* compiled from: PG */
/* renamed from: dou  reason: default package */
/* loaded from: classes.dex */
public final class dou {
    private static final ndk a = new ndk();
    private static final ndk b = new ndk((byte[]) null);

    public static CharSequence a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (charSequence.toString().endsWith("္")) {
            charSequence = charSequence.subSequence(0, charSequence.length() - 1);
        }
        return a.b(charSequence);
    }

    public static CharSequence b(CharSequence charSequence) {
        return b.b(charSequence);
    }
}
