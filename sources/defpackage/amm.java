package defpackage;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: amm  reason: default package */
/* loaded from: classes.dex */
public final class amm implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ LottieAnimationView b;

    public amm(LottieAnimationView lottieAnimationView, String str) {
        this.b = lottieAnimationView;
        this.a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        LottieAnimationView lottieAnimationView = this.b;
        boolean z = lottieAnimationView.e;
        Context context = lottieAnimationView.getContext();
        return z ? ams.a(context, this.a) : ams.b(context, this.a, null);
    }
}
