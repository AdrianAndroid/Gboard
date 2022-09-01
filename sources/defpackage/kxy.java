package defpackage;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;

/* compiled from: PG */
/* renamed from: kxy  reason: default package */
/* loaded from: classes.dex */
final class kxy implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            kye kyeVar = (kye) message.obj;
            int i2 = message.arg1;
            if (!kyeVar.j() || kyeVar.e.getVisibility() != 0) {
                kyeVar.k();
            } else if (kyeVar.e.c == 1) {
                ValueAnimator c = kyeVar.c(1.0f, 0.0f);
                c.setDuration(75L);
                c.addListener(new kxv(kyeVar));
                c.start();
            } else {
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setIntValues(0, kyeVar.b());
                valueAnimator.setInterpolator(krt.b);
                valueAnimator.setDuration(250L);
                valueAnimator.addListener(new kxx(kyeVar));
                valueAnimator.addUpdateListener(new ksq(kyeVar, 5));
                valueAnimator.start();
            }
            return true;
        }
        kye kyeVar2 = (kye) message.obj;
        if (kyeVar2.e.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = kyeVar2.e.getLayoutParams();
            if (layoutParams instanceof tr) {
                tr trVar = (tr) layoutParams;
                BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                baseTransientBottomBar$Behavior.g.a = kyeVar2.m;
                baseTransientBottomBar$Behavior.f = new opu(kyeVar2);
                trVar.b(baseTransientBottomBar$Behavior);
                trVar.g = 80;
            }
            kyd kydVar = kyeVar2.e;
            ViewGroup viewGroup = kyeVar2.c;
            kydVar.g = true;
            viewGroup.addView(kydVar);
            kydVar.g = false;
            int i3 = kyeVar2.j;
            kyeVar2.e.setVisibility(4);
        }
        if (aad.ah(kyeVar2.e)) {
            kyeVar2.h();
        } else {
            kyeVar2.k = true;
        }
        return true;
    }
}
