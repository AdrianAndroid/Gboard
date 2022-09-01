package j$.time.format;

import j$.util.Objects;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class h extends j {
    private final boolean g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(j$.time.temporal.a aVar) {
        this(aVar, 0, 9, true, 0);
        Objects.a(aVar, "field");
        if (aVar.c().f()) {
            return;
        }
        throw new IllegalArgumentException(j$.net.a.a("Field must have a fixed set of values: ", String.valueOf(aVar)));
    }

    h(j$.time.temporal.n nVar, int i, int i2, boolean z, int i3) {
        super(nVar, i, i2, w.NOT_NEGATIVE, i3);
        this.g = z;
    }

    @Override // j$.time.format.j, j$.time.format.g
    public final boolean a(r rVar, StringBuilder sb) {
        BigDecimal stripTrailingZeros;
        j$.time.temporal.n nVar = this.a;
        Long e = rVar.e(nVar);
        if (e == null) {
            return false;
        }
        u b = rVar.b();
        long longValue = e.longValue();
        j$.time.temporal.s c = nVar.c();
        c.b(longValue, nVar);
        BigDecimal valueOf = BigDecimal.valueOf(c.e());
        BigDecimal divide = BigDecimal.valueOf(longValue).subtract(valueOf).divide(BigDecimal.valueOf(c.d()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
        if (divide.compareTo(BigDecimal.ZERO) == 0) {
            stripTrailingZeros = BigDecimal.ZERO;
        } else {
            stripTrailingZeros = divide.stripTrailingZeros();
        }
        int scale = stripTrailingZeros.scale();
        boolean z = this.g;
        int i = this.b;
        if (scale == 0) {
            if (i > 0) {
                if (z) {
                    b.getClass();
                    sb.append('.');
                }
                for (int i2 = 0; i2 < i; i2++) {
                    b.getClass();
                    sb.append('0');
                }
                return true;
            }
            return true;
        }
        String substring = stripTrailingZeros.setScale(Math.min(Math.max(stripTrailingZeros.scale(), i), this.c), RoundingMode.FLOOR).toPlainString().substring(2);
        b.getClass();
        if (z) {
            sb.append('.');
        }
        sb.append(substring);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.j
    public final j c() {
        return this.e == -1 ? this : new h(this.a, this.b, this.c, this.g, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.j
    public final j d(int i) {
        return new h(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.j
    public final String toString() {
        String str = this.g ? ",DecimalPoint" : "";
        String valueOf = String.valueOf(this.a);
        return "Fraction(" + valueOf + "," + this.b + "," + this.c + str + ")";
    }
}
