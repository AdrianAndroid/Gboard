package defpackage;

/* compiled from: PG */
/* renamed from: kmi  reason: default package */
/* loaded from: classes.dex */
public final class kmi implements ght {
    final /* synthetic */ float[][] a;
    final /* synthetic */ float[][] b;
    private final Float[] c;

    public kmi(float[][] fArr, float[][] fArr2) {
        this.a = fArr;
        this.b = fArr2;
        int length = fArr[0].length;
        Float[] fArr3 = new Float[length];
        for (int i = 0; i < length; i++) {
            fArr3[i] = Float.valueOf(0.0f);
        }
        this.c = fArr3;
    }

    @Override // defpackage.ght
    public final /* bridge */ /* synthetic */ Object a(float f) {
        float length = (this.a.length - 1) * f;
        int floor = (int) Math.floor(length);
        int ceil = (int) Math.ceil((this.a.length - 1) * f);
        float f2 = length - floor;
        int length2 = this.c.length;
        for (int i = 0; i < length2; i++) {
            Float[] fArr = this.c;
            float[][] fArr2 = this.b;
            float f3 = fArr2[floor][i];
            fArr[i] = Float.valueOf(f3 + ((fArr2[ceil][i] - f3) * f2));
        }
        return this.c;
    }
}
