package defpackage;

/* compiled from: PG */
/* renamed from: ovx  reason: default package */
/* loaded from: classes2.dex */
final class ovx implements owa {
    @Override // defpackage.owa
    public final String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            if (b == 0) {
                break;
            }
            sb.append((char) (b & 255));
        }
        return sb.toString();
    }
}
