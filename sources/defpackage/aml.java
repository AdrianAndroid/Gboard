package defpackage;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: aml  reason: default package */
/* loaded from: classes.dex */
public final class aml implements Callable {
    final /* synthetic */ int a;
    final /* synthetic */ LottieAnimationView b;

    public aml(LottieAnimationView lottieAnimationView, int i) {
        this.b = lottieAnimationView;
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        LottieAnimationView lottieAnimationView = this.b;
        boolean z = lottieAnimationView.e;
        Context context = lottieAnimationView.getContext();
        if (!z) {
            return ams.d(context, this.a, null);
        }
        int i = this.a;
        return ams.d(context, i, ams.k(context, i));
    }
}
