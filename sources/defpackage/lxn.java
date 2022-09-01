package defpackage;

/* compiled from: PG */
/* renamed from: lxn  reason: default package */
/* loaded from: classes.dex */
abstract class lxn implements lxv {
    public void a(char c) {
        throw null;
    }

    @Override // defpackage.lxv
    public void d(byte[] bArr, int i) {
        throw null;
    }

    @Override // defpackage.lxv
    public final void e(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            a(charSequence.charAt(i));
        }
    }
}
