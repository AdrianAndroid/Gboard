package defpackage;

/* compiled from: PG */
/* renamed from: oaq  reason: default package */
/* loaded from: classes2.dex */
final class oaq implements ntn {
    private final /* synthetic */ int a;

    public oaq(int i) {
        this.a = i;
    }

    @Override // defpackage.nul
    public final /* synthetic */ Object a(byte[] bArr) {
        if (this.a != 0) {
            return bArr;
        }
        if (bArr.length >= 3) {
            return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
        }
        throw new NumberFormatException("Malformed status code ".concat(new String(bArr, nto.a)));
    }

    @Override // defpackage.nul
    public final /* synthetic */ byte[] b(Object obj) {
        if (this.a == 0) {
            Integer num = (Integer) obj;
            throw new UnsupportedOperationException();
        }
        return (byte[]) obj;
    }
}
