package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.Closeable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: kvl  reason: default package */
/* loaded from: classes.dex */
public final class kvl implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kvl(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    public kvl(Closeable closeable, int i) {
        this.b = i;
        this.a = closeable;
    }

    public /* synthetic */ kvl(HttpURLConnection httpURLConnection, int i) {
        this.b = i;
        this.a = httpURLConnection;
    }

    public /* synthetic */ kvl(Map.Entry entry, int i) {
        this.b = i;
        this.a = entry;
    }

    public kvl(Future future, int i) {
        this.b = i;
        this.a = future;
    }

    public kvl(ksx ksxVar, int i) {
        this.b = i;
        this.a = ksxVar;
    }

    public kvl(kvo kvoVar, int i) {
        this.b = i;
        this.a = kvoVar;
    }

    public kvl(kye kyeVar, int i) {
        this.b = i;
        this.a = kyeVar;
    }

    public kvl(kzz kzzVar, int i) {
        this.b = i;
        this.a = kzzVar;
    }

    public kvl(mjf mjfVar, int i) {
        this.b = i;
        this.a = mjfVar;
    }

    public /* synthetic */ kvl(mmc mmcVar, int i) {
        this.b = i;
        this.a = mmcVar;
    }

    public /* synthetic */ kvl(myx myxVar, int i) {
        this.b = i;
        this.a = myxVar;
    }

    public kvl(nsn nsnVar, int i) {
        this.b = i;
        this.a = nsnVar;
    }

    public /* synthetic */ kvl(nwl nwlVar, int i) {
        this.b = i;
        this.a = nwlVar;
    }

    public /* synthetic */ kvl(nwn nwnVar, int i) {
        this.b = i;
        this.a = nwnVar;
    }

    public kvl(nzn nznVar, int i) {
        this.b = i;
        this.a = nznVar;
    }

    public kvl(nzo nzoVar, int i) {
        this.b = i;
        this.a = nzoVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.util.Map$Entry, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        switch (this.b) {
            case 0:
                ((kvo) this.a).e();
                return;
            case 1:
                ksx ksxVar = (ksx) this.a;
                ksxVar.b = false;
                ada adaVar = ksxVar.c.x;
                if (adaVar == null || !adaVar.l()) {
                    ksx ksxVar2 = (ksx) this.a;
                    BottomSheetBehavior bottomSheetBehavior = ksxVar2.c;
                    if (bottomSheetBehavior.w != 2) {
                        return;
                    }
                    bottomSheetBehavior.C(ksxVar2.a);
                    return;
                }
                ksx ksxVar3 = (ksx) this.a;
                ksxVar3.a(ksxVar3.a);
                return;
            case 2:
                kvo kvoVar = (kvo) this.a;
                ((kwb) kvoVar.getCurrentDrawable()).h(false, false, true);
                if (kvoVar.getProgressDrawable() != null && kvoVar.getProgressDrawable().isVisible()) {
                    return;
                }
                if (kvoVar.getIndeterminateDrawable() != null && kvoVar.getIndeterminateDrawable().isVisible()) {
                    return;
                }
                kvoVar.setVisibility(4);
                return;
            case 3:
                kye kyeVar = (kye) this.a;
                if (kyeVar.e == null || (context = kyeVar.d) == null) {
                    return;
                }
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
                int i = displayMetrics.heightPixels;
                int[] iArr = new int[2];
                kye kyeVar2 = (kye) this.a;
                kyeVar2.e.getLocationOnScreen(iArr);
                int height = (i - (iArr[1] + kyeVar2.e.getHeight())) + ((int) ((kye) this.a).e.getTranslationY());
                kye kyeVar3 = (kye) this.a;
                if (height >= kyeVar3.i) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = kyeVar3.e.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(kye.b, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += ((kye) this.a).i - height;
                ((kye) this.a).e.requestLayout();
                return;
            case 4:
                ((kye) this.a).k();
                return;
            case 5:
                kyd kydVar = ((kye) this.a).e;
                if (kydVar == null) {
                    return;
                }
                if (kydVar.getParent() != null) {
                    ((kye) this.a).e.setVisibility(0);
                }
                kye kyeVar4 = (kye) this.a;
                if (kyeVar4.e.c != 1) {
                    int b = kyeVar4.b();
                    kyeVar4.e.setTranslationY(b);
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(b, 0);
                    valueAnimator.setInterpolator(krt.b);
                    valueAnimator.setDuration(250L);
                    valueAnimator.addListener(new kxw(kyeVar4));
                    valueAnimator.addUpdateListener(new ksq(kyeVar4, 4));
                    valueAnimator.start();
                    return;
                }
                ValueAnimator c = kyeVar4.c(0.0f, 1.0f);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
                ofFloat.setInterpolator(krt.d);
                ofFloat.addUpdateListener(new ksq(kyeVar4, 3));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(c, ofFloat);
                animatorSet.setDuration(150L);
                animatorSet.addListener(new kyb(kyeVar4));
                animatorSet.start();
                return;
            case 6:
                Object obj = this.a;
                AtomicReference atomicReference = kzz.a;
                try {
                    lax.f((Context) obj).e();
                    return;
                } catch (SecurityException unused) {
                    Log.e("SplitCompat", "Failed to set broadcast receiver to always on.");
                    return;
                }
            case 7:
                try {
                    ((kzz) this.a).b.j();
                    return;
                } catch (Exception e) {
                    Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e);
                    return;
                }
            case 8:
                try {
                    this.a.close();
                    return;
                } catch (IOException | RuntimeException e2) {
                    mjf.a.logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture$11", "run", "thrown by close()", e2);
                    return;
                }
            case 9:
                ((mjf) this.a).e(mje.WILL_CLOSE, mje.CLOSING);
                Object obj2 = this.a;
                mjf.a.logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "close", "closing {0}", obj2);
                ((mjf) obj2).b.close();
                ((mjf) this.a).e(mje.CLOSING, mje.CLOSED);
                return;
            case 10:
                this.a.cancel(false);
                return;
            case 11:
                Object obj3 = this.a;
                synchronized (obj3) {
                    int i2 = ((mmc) obj3).o;
                    if (i2 == 4) {
                        return;
                    }
                    ((mmc) obj3).o = 4;
                    ((mmc) obj3).l(3, "request cancelled via close()", i2);
                    Future future = ((mmc) obj3).j;
                    if (future != null) {
                        future.cancel(true);
                    }
                    if (((mmc) obj3).f) {
                        ((mmc) obj3).i.run();
                    }
                    return;
                }
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((HttpURLConnection) this.a).disconnect();
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((moa) this.a.getKey()).a();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                myx myxVar = (myx) this.a;
                myxVar.c.close();
                myxVar.a.close();
                return;
            case 15:
                try {
                    ((nsn) this.a).j(new TimeoutException("context timed out"));
                    return;
                } catch (Throwable th) {
                    nsu.c.logp(Level.SEVERE, "io.grpc.Context$CancellableContext$1CancelOnExpiration", "run", "Cancel threw an exception, which should not happen", th);
                    return;
                }
            case 16:
                Object obj4 = this.a;
                synchronized (obj4) {
                    if (((nwn) obj4).v(4)) {
                        ((nwn) obj4).p(((nwn) obj4).l, true);
                    }
                }
                return;
            case 17:
                Object obj5 = this.a;
                synchronized (obj5) {
                    if (((nwn) obj5).v(1)) {
                        ((nwn) obj5).u(2);
                        ((nwl) obj5).c.a();
                    }
                }
                return;
            case 18:
                ((nzo) this.a).h();
                return;
            case 19:
                ((nzo) this.a).b.c();
                return;
            default:
                ((nzn) this.a).c.f();
                return;
        }
    }
}
