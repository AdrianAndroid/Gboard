package defpackage;

import com.google.learning.expander.pod.inferenceapi.core.PredictionResult;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: xr  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class xr implements Comparator {
    private final /* synthetic */ int v;
    public static final /* synthetic */ xr u = new xr(20);
    public static final /* synthetic */ xr t = new xr(19);
    public static final /* synthetic */ xr s = new xr(18);
    public static final /* synthetic */ xr r = new xr(17);
    public static final /* synthetic */ xr q = new xr(16);
    public static final /* synthetic */ xr p = new xr(15);
    public static final /* synthetic */ xr o = new xr(14);
    public static final /* synthetic */ xr n = new xr(13);
    public static final /* synthetic */ xr m = new xr(12);
    public static final /* synthetic */ xr l = new xr(11);
    public static final /* synthetic */ xr k = new xr(10);
    public static final /* synthetic */ xr j = new xr(9);
    public static final /* synthetic */ xr i = new xr(8);
    public static final /* synthetic */ xr h = new xr(7);
    public static final /* synthetic */ xr g = new xr(6);
    public static final /* synthetic */ xr f = new xr(5);
    public static final /* synthetic */ xr e = new xr(4);
    public static final /* synthetic */ xr d = new xr(3);
    public static final /* synthetic */ xr c = new xr(2);
    public static final /* synthetic */ xr b = new xr(1);
    public static final /* synthetic */ xr a = new xr(0);

    private /* synthetic */ xr(int i2) {
        this.v = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.v) {
            case 0:
                bkc bkcVar = (bkc) obj;
                bkc bkcVar2 = (bkc) obj2;
                int i2 = bkcVar.a;
                int i3 = bkcVar2.a;
                if (i2 < i3) {
                    return -1;
                }
                if (i2 <= i3) {
                    int i4 = bkcVar2.b;
                    int i5 = bkcVar.b;
                    if (i4 == i5) {
                        return 0;
                    }
                    if (i4 < i5) {
                        return -1;
                    }
                }
                return 1;
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                int length = bArr.length;
                int length2 = bArr2.length;
                if (length != length2) {
                    return length - length2;
                }
                for (int i6 = 0; i6 < bArr.length; i6++) {
                    byte b2 = bArr[i6];
                    byte b3 = bArr2[i6];
                    if (b2 != b3) {
                        return b2 - b3;
                    }
                }
                return 0;
            case 2:
                hex hexVar = (hex) obj;
                hex hexVar2 = (hex) obj2;
                return lkk.b.b(hexVar.c, hexVar2.c).b(hexVar2.a.length(), hexVar.a.length()).b(hexVar.b, hexVar2.b).a();
            case 3:
                long j2 = ((buk) obj).e;
                long j3 = ((buk) obj2).e;
                if (j2 < j3) {
                    return 1;
                }
                return j2 == j3 ? 0 : -1;
            case 4:
                return String.valueOf((Locale) obj).compareTo(String.valueOf((Locale) obj2));
            case 5:
                cuf cufVar = (cuf) obj;
                cuf cufVar2 = (cuf) obj2;
                return lkk.b.c(cufVar.b, cufVar2.b).c(cufVar.a, cufVar2.a).a();
            case 6:
                cuz cuzVar = cuz.a;
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            case 7:
                dal dalVar = (dal) obj;
                dal dalVar2 = (dal) obj2;
                return lkk.b.d(Integer.valueOf(dalVar.c), Integer.valueOf(dalVar2.c), lrt.a).d(Long.valueOf(dalVar.d), Long.valueOf(dalVar2.d), lrt.a).a();
            case 8:
                return Float.compare(((Float) obj).floatValue(), ((Float) obj2).floatValue());
            case 9:
                return ((CharSequence) obj).toString().compareToIgnoreCase(((CharSequence) obj2).toString());
            case 10:
                PredictionResult predictionResult = (PredictionResult) obj;
                PredictionResult predictionResult2 = (PredictionResult) obj2;
                ltg ltgVar = ebs.a;
                int compare = Float.compare(predictionResult.b, predictionResult2.b);
                if (compare != 0) {
                    return compare;
                }
                if ("neutral".equals(predictionResult.a)) {
                    return 1;
                }
                return "neutral".equals(predictionResult2.a) ? -1 : 0;
            case 11:
                boolean equals = "bitmoji".equals(((cqp) obj).r());
                boolean equals2 = "bitmoji".equals(((cqp) obj2).r());
                if (equals) {
                    if (!equals2) {
                        return -1;
                    }
                    equals2 = true;
                }
                return (equals || !equals2) ? 0 : 1;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return ((enk) obj).d - ((enk) obj2).d;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                nnx nnxVar = (nnx) obj;
                nnx nnxVar2 = (nnx) obj2;
                long j4 = nnxVar.a;
                long j5 = nnxVar2.a;
                return j4 == j5 ? fdz.e(nnxVar.b, nnxVar2.b) : (j4 > j5 ? 1 : (j4 == j5 ? 0 : -1));
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                nnx nnxVar3 = (nnx) obj;
                nnx nnxVar4 = (nnx) obj2;
                long j6 = nnxVar3.a;
                long j7 = nnxVar4.a;
                return j6 == j7 ? fdz.e(nnxVar4.b, nnxVar3.b) : (j7 > j6 ? 1 : (j7 == j6 ? 0 : -1));
            case 15:
                byte[] bArr3 = (byte[]) obj;
                byte[] bArr4 = (byte[]) obj2;
                Charset charset = fma.a;
                int min = Math.min(bArr3.length, bArr4.length);
                for (int i7 = 0; i7 < min; i7++) {
                    byte b4 = bArr3[i7];
                    byte b5 = bArr4[i7];
                    if (b4 != b5) {
                        return b4 - b5;
                    }
                }
                return bArr3.length - bArr4.length;
            case 16:
                return (((nom) obj).b > ((nom) obj2).b ? 1 : (((nom) obj).b == ((nom) obj2).b ? 0 : -1));
            case 17:
                gzt gztVar = gzt.a;
                return ((gzv) obj).getDumpableTag().compareTo(((gzv) obj2).getDumpableTag());
            case 18:
                jlq jlqVar = (jlq) obj;
                jlq jlqVar2 = (jlq) obj2;
                return lkk.b.c(jlqVar.a.b, jlqVar2.a.b).c(jlqVar.a.d, jlqVar2.a.d).a();
            case 19:
                return jez.u(((jlq) obj).a).compareTo(jez.u(((jlq) obj2).a));
            default:
                return jez.u((jiq) obj).compareTo(jez.u((jiq) obj2));
        }
    }
}
