package defpackage;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: cmt  reason: default package */
/* loaded from: classes.dex */
public final class cmt {
    private int a;
    private int b;
    private int c;
    private final Object d;
    private Object e;
    private Object f;

    public cmt() {
        this.d = new DecelerateInterpolator();
    }

    public cmt(adx adxVar) {
        this.a = 1;
        this.d = adxVar;
        this.e = adxVar;
    }

    private static boolean j(int i) {
        return i == 65039;
    }

    private final boolean k() {
        ajj e = ((adr) ((adx) this.e).b).e();
        int a = e.a(6);
        return !(a == 0 || e.b.get(a + e.a) == 0) || j(this.c);
    }

    private final void l() {
        this.a = 1;
        this.e = this.d;
        this.b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        Object obj = this.e;
        if (obj == null) {
            return;
        }
        ProgressBar progressBar = (ProgressBar) obj;
        progressBar.animate().setListener(null).cancel();
        progressBar.setVisibility(4);
        progressBar.setAlpha(0.0f);
        progressBar.setProgress(0);
        this.b = 0;
        this.c = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.e = null;
        this.f = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        e(this.b, this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(View view) {
        this.e = (ProgressBar) view.findViewById(R.id.f54330_resource_name_obfuscated_res_0x7f0b0195);
        this.f = (ProgressBar) view.findViewById(R.id.f54340_resource_name_obfuscated_res_0x7f0b0196);
        Object obj = this.e;
        if (obj != null) {
            this.a = ((ProgressBar) obj).getMax();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.widget.ProgressBar] */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.view.animation.Interpolator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.view.animation.Interpolator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.view.animation.Animation] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(int r20, int r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.Object r3 = r0.e
            java.lang.Object r4 = r0.f
            if (r3 == 0) goto Lc4
            if (r4 == 0) goto Lc4
            int r5 = r0.a
            if (r5 <= 0) goto Lc4
            if (r1 < 0) goto Lc4
            if (r1 >= r2) goto Lc4
            r6 = 1
            if (r2 > r6) goto L1b
            goto Lc4
        L1b:
            int r7 = r2 + (-1)
            float r5 = (float) r5
            float r8 = (float) r7
            float r5 = r5 / r8
            android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
            android.view.ViewPropertyAnimator r8 = r3.animate()
            r9 = 0
            android.view.ViewPropertyAnimator r8 = r8.setListener(r9)
            r8.cancel()
            r8 = 1065353216(0x3f800000, float:1.0)
            r3.setAlpha(r8)
            r10 = 0
            r3.setVisibility(r10)
            r11 = 0
            r12 = -1028390912(0xffffffffc2b40000, float:-90.0)
            if (r1 != 0) goto L4a
            r3.setRotation(r12)
            cms r8 = new cms
            r8.<init>(r3, r11, r5)
        L44:
            r18 = r9
            r9 = r8
            r8 = r18
            goto L96
        L4a:
            if (r1 == r7) goto L61
            int r8 = r1 + (-1)
            float r8 = (float) r8
            float r12 = r5 * r8
            android.view.animation.RotateAnimation r8 = new android.view.animation.RotateAnimation
            float r13 = r12 + r5
            r14 = 1
            r15 = 1056964608(0x3f000000, float:0.5)
            r16 = 1
            r17 = 1056964608(0x3f000000, float:0.5)
            r11 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17)
            goto L44
        L61:
            r13 = r4
            android.widget.ProgressBar r13 = (android.widget.ProgressBar) r13
            android.view.ViewPropertyAnimator r14 = r13.animate()
            android.view.ViewPropertyAnimator r14 = r14.setListener(r9)
            r14.cancel()
            int r14 = r1 + (-1)
            float r14 = (float) r14
            float r14 = r14 * r5
            r13.setRotation(r12)
            int r12 = (int) r14
            r13.setProgress(r12)
            r13.setAlpha(r8)
            r13.setVisibility(r10)
            r3.setAlpha(r11)
            r8 = 4
            r3.setVisibility(r8)
            cms r8 = new cms
            float r5 = r5 + r14
            r8.<init>(r13, r14, r5)
            dgo r5 = new dgo
            r5.<init>(r13, r6)
            r8.setAnimationListener(r5)
        L96:
            r11 = 400(0x190, double:1.976E-321)
            if (r9 == 0) goto La8
            r9.setDuration(r11)
            java.lang.Object r5 = r0.d
            r9.setInterpolator(r5)
            r9.setFillAfter(r6)
            r3.startAnimation(r9)
        La8:
            if (r8 == 0) goto Lb7
            r8.setDuration(r11)
            java.lang.Object r3 = r0.d
            r8.setInterpolator(r3)
            android.widget.ProgressBar r4 = (android.widget.ProgressBar) r4
            r4.setAnimation(r8)
        Lb7:
            if (r1 == r7) goto Lbb
            r3 = r1
            goto Lbc
        Lbb:
            r3 = 0
        Lbc:
            r0.b = r3
            if (r1 == r7) goto Lc1
            goto Lc2
        Lc1:
            r2 = 0
        Lc2:
            r0.c = r2
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmt.e(int, int):void");
    }

    public final int f(int i) {
        adx a = ((adx) this.e).a(i);
        int i2 = 1;
        if (this.a == 2) {
            if (a != null) {
                this.e = a;
                this.b++;
            } else if (i == 65038) {
                l();
            } else if (!j(i)) {
                Object obj = this.e;
                if (((adx) obj).b != null) {
                    if (this.b == 1) {
                        if (k()) {
                            this.f = this.e;
                            l();
                        } else {
                            l();
                        }
                    } else {
                        this.f = obj;
                        l();
                    }
                    i2 = 3;
                } else {
                    l();
                }
            }
            i2 = 2;
        } else if (a == null) {
            l();
        } else {
            this.a = 2;
            this.e = a;
            this.b = 1;
            i2 = 2;
        }
        this.c = i;
        return i2;
    }

    public final adr g() {
        return (adr) ((adx) this.e).b;
    }

    public final adr h() {
        return (adr) ((adx) this.f).b;
    }

    public final boolean i() {
        if (this.a != 2 || ((adx) this.e).b == null) {
            return false;
        }
        return this.b > 1 || k();
    }
}
