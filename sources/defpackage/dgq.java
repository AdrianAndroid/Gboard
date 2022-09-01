package defpackage;

import android.os.SystemClock;
import java.util.Locale;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: dgq  reason: default package */
/* loaded from: classes.dex */
public final class dgq {
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private final long a = SystemClock.elapsedRealtime();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a() {
        double d;
        Locale locale = Locale.US;
        Object[] objArr = new Object[7];
        long elapsedRealtime = (SystemClock.elapsedRealtime() - this.a) / 1000;
        objArr[0] = String.format(Locale.US, "%dd %02d:%02d:%02d", Long.valueOf(elapsedRealtime / 86400), Long.valueOf((elapsedRealtime % 86400) / 3600), Long.valueOf((elapsedRealtime % 3600) / 60), Long.valueOf(elapsedRealtime % 60));
        int i = this.b;
        int i2 = this.c + i;
        double d2 = -1.0d;
        if (i2 > 0) {
            double d3 = i;
            double d4 = i2;
            Double.isNaN(d3);
            Double.isNaN(d4);
            d = d3 / d4;
        } else {
            d = -1.0d;
        }
        objArr[1] = Double.valueOf(d * 100.0d);
        int i3 = this.e;
        if (i3 > 0) {
            double d5 = this.d;
            double d6 = i3;
            Double.isNaN(d5);
            Double.isNaN(d6);
            d2 = d5 / d6;
        }
        objArr[2] = Double.valueOf(d2);
        objArr[3] = Integer.valueOf(this.b);
        objArr[4] = Integer.valueOf(this.c);
        objArr[5] = Integer.valueOf(this.d);
        objArr[6] = Integer.valueOf(this.e);
        return String.format(locale, "[%s] Top1Confirmation: %f CharacterDeletionRate: %f (Top1Confirms: %d SelectOtherCandidates: %d NumCharsConfirmed: %d NumCharsDeleted: %d)", objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean b(mbi mbiVar, int i) {
        mbi mbiVar2 = mbi.UNDEFINED;
        switch (mbiVar.ordinal()) {
            case 5:
                this.d++;
                return true;
            case 6:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            default:
                return false;
            case 7:
                this.e++;
                return true;
            case 8:
                this.e++;
                this.c++;
                this.d += i;
                return true;
            case 9:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 15:
            case 16:
            case 17:
                break;
            case 10:
                this.c++;
                this.d += i;
                return true;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                this.d++;
                break;
        }
        this.b++;
        this.d += i;
        return true;
    }
}
