package defpackage;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: amk  reason: default package */
/* loaded from: classes.dex */
public final class amk implements ana {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public amk(LottieAnimationView lottieAnimationView, int i) {
        this.b = i;
        this.a = lottieAnimationView;
    }

    public amk(String str, int i) {
        this.b = i;
        this.a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.graphics.drawable.Drawable$Callback, java.lang.Object] */
    @Override // defpackage.ana
    public final /* synthetic */ void a(Object obj) {
        float f;
        float f2;
        int i = this.b;
        if (i == 0) {
            Throwable th = (Throwable) obj;
            Object obj2 = this.a;
            int i2 = ((LottieAnimationView) obj2).b;
            if (i2 != 0) {
                ((AppCompatImageView) obj2).setImageResource(i2);
            }
            LottieAnimationView.a.a(th);
            return;
        }
        boolean z = true;
        if (i != 1) {
            if (i == 2) {
                amp ampVar = (amp) obj;
                ams.a.remove(this.a);
                return;
            }
            Throwable th2 = (Throwable) obj;
            ams.a.remove(this.a);
            return;
        }
        amp ampVar2 = (amp) obj;
        ?? r0 = this.a;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) r0;
        lottieAnimationView.c.setCallback(r0);
        lottieAnimationView.g = ampVar2;
        lottieAnimationView.d = true;
        amy amyVar = lottieAnimationView.c;
        if (amyVar.a == ampVar2) {
            z = false;
        } else {
            amyVar.k = false;
            amyVar.h();
            amyVar.a = ampVar2;
            amyVar.g();
            asb asbVar = amyVar.b;
            amp ampVar3 = asbVar.h;
            asbVar.h = ampVar2;
            if (ampVar3 == null) {
                f = (int) Math.max(asbVar.f, ampVar2.h);
                f2 = Math.min(asbVar.g, ampVar2.i);
            } else {
                f = (int) ampVar2.h;
                f2 = ampVar2.i;
            }
            asbVar.l(f, (int) f2);
            float f3 = asbVar.d;
            asbVar.d = 0.0f;
            asbVar.k((int) f3);
            asbVar.b();
            amyVar.m(amyVar.b.getAnimatedFraction());
            float f4 = amyVar.c;
            Iterator it = new ArrayList(amyVar.f).iterator();
            while (it.hasNext()) {
                amx amxVar = (amx) it.next();
                if (amxVar != null) {
                    amxVar.a();
                }
                it.remove();
            }
            amyVar.f.clear();
            wk wkVar = ampVar2.m;
            Drawable.Callback callback = amyVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(amyVar);
            }
        }
        lottieAnimationView.d = false;
        lottieAnimationView.a();
        if (lottieAnimationView.getDrawable() == lottieAnimationView.c) {
            if (!z) {
                return;
            }
        } else if (!z) {
            boolean i3 = lottieAnimationView.i();
            AppCompatImageView appCompatImageView = (AppCompatImageView) r0;
            appCompatImageView.setImageDrawable(null);
            appCompatImageView.setImageDrawable(lottieAnimationView.c);
            if (i3) {
                lottieAnimationView.c.k();
            }
        }
        lottieAnimationView.onVisibilityChanged((View) r0, lottieAnimationView.getVisibility());
        lottieAnimationView.requestLayout();
        for (anc ancVar : lottieAnimationView.f) {
            ancVar.a();
        }
    }
}
