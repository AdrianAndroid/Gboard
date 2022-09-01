package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: bsd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bsd implements Runnable {
    private final /* synthetic */ int t;
    public static final /* synthetic */ bsd s = new bsd(20);
    public static final /* synthetic */ bsd r = new bsd(19);
    public static final /* synthetic */ bsd q = new bsd(18);
    public static final /* synthetic */ bsd p = new bsd(17);
    public static final /* synthetic */ bsd o = new bsd(16);
    public static final /* synthetic */ bsd n = new bsd(15);
    public static final /* synthetic */ bsd m = new bsd(13);
    public static final /* synthetic */ bsd l = new bsd(12);
    public static final /* synthetic */ bsd k = new bsd(11);
    public static final /* synthetic */ bsd j = new bsd(10);
    public static final /* synthetic */ bsd i = new bsd(9);
    public static final /* synthetic */ bsd h = new bsd(8);
    public static final /* synthetic */ bsd g = new bsd(7);
    public static final /* synthetic */ bsd f = new bsd(6);
    public static final /* synthetic */ bsd e = new bsd(5);
    public static final /* synthetic */ bsd d = new bsd(4);
    public static final /* synthetic */ bsd c = new bsd(3);
    public static final /* synthetic */ bsd b = new bsd(2);
    public static final /* synthetic */ bsd a = new bsd(0);

    public /* synthetic */ bsd(int i2) {
        this.t = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.t) {
            case 0:
                bsi.g();
                return;
            case 1:
                return;
            case 2:
                ieh.j().e(bsw.PROMPT_SHOWN, new Object[0]);
                return;
            case 3:
                ltg ltgVar = eie.a;
                return;
            case 4:
                return;
            case 5:
                int i2 = emu.g;
                return;
            case 6:
                ieh.j().e(eoq.TOAST_SHOW, new Object[0]);
                return;
            case 7:
                ltg ltgVar2 = epe.a;
                return;
            case 8:
                return;
            case 9:
                fbf.d();
                return;
            case 10:
                ((ltd) ((ltd) fcj.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoicePermissionKeyboardOverlay", "lambda$showVoicePermissionPromo$3", 103, "VoicePermissionKeyboardOverlay.java")).t("voice permission overlay displayed");
                ieh.j().e(fbm.MIC_PERMISSION_OVERLAY_USAGE, 0);
                return;
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return;
            case 15:
                ltg ltgVar3 = hyy.a;
                return;
            case 16:
                ieh.j().n();
                return;
            case 17:
            case 18:
                return;
            case 19:
                kju.e();
                return;
            default:
                throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
        }
    }
}
