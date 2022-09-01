package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.inputmethod.latin.R;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: dlp  reason: default package */
/* loaded from: classes.dex */
public final class dlp implements hov, dln {
    public final iav a;
    public final String b;
    public final dlm c;
    public boolean d;
    final /* synthetic */ dlq e;
    public final jls f;
    private final dlh g;
    private final hpa h;

    public dlp(dlq dlqVar, iav iavVar, String str, hqt hqtVar, jls jlsVar, dlm dlmVar, byte[] bArr) {
        this.e = dlqVar;
        dlh dlhVar = new dlh(dlqVar);
        this.g = dlhVar;
        this.a = iavVar;
        this.b = str;
        this.c = dlmVar;
        Context context = dlqVar.b;
        dli dliVar = new dli();
        iav.a();
        hpa hpaVar = new hpa(context, dliVar);
        this.h = hpaVar;
        this.f = jlsVar;
        hpaVar.b = false;
        hpaVar.c(new hox(dlqVar.b, dlhVar, iavVar));
        hpaVar.f(iau.SOFT);
        dlhVar.a = new dlo(this, hqtVar, jlsVar, null);
    }

    @Override // defpackage.dln
    public final void a() {
        c();
    }

    public final String b() {
        return this.a.f.c;
    }

    public final void c() {
        if (!this.d) {
            this.h.close();
            this.d = true;
        }
    }

    @Override // defpackage.hov
    public final void d(hsy hsyVar, ibm ibmVar, ibz ibzVar) {
        if (hsyVar != null) {
            dlq dlqVar = this.e;
            try {
                Bitmap a = dlqVar.a(this, ibzVar);
                if (a == null) {
                    int i = this.a.f.f;
                    int i2 = dlqVar.g;
                    if (i != 0 && i != R.style.f193600_resource_name_obfuscated_res_0x7f1502bc) {
                        i2 = dds.g(dlqVar.b, dlqVar.d);
                    }
                    int i3 = dlqVar.f;
                    LayoutInflater from = LayoutInflater.from(dlqVar.b);
                    FrameLayout frameLayout = new FrameLayout(dlqVar.b);
                    from.inflate(R.layout.f144710_resource_name_obfuscated_res_0x7f0e04fd, (ViewGroup) frameLayout, true);
                    hsyVar.ag();
                    dlqVar.l[ice.HEADER.ordinal()] = (ViewGroup) frameLayout.findViewById(R.id.keyboard_header_view_holder);
                    dlqVar.l[ice.BODY.ordinal()] = (ViewGroup) frameLayout.findViewById(R.id.f58150_resource_name_obfuscated_res_0x7f0b0469);
                    ice[] iceVarArr = dlqVar.d;
                    int length = iceVarArr.length;
                    for (int i4 = 0; i4 < 2; i4++) {
                        ice iceVar = iceVarArr[i4];
                        ViewGroup viewGroup = dlqVar.l[iceVar.ordinal()];
                        View Y = hsyVar.Y(iceVar);
                        if (viewGroup != null && Y != null) {
                            viewGroup.addView(Y);
                            viewGroup.setVisibility(0);
                        }
                    }
                    hsyVar.g(dlqVar.m, htg.a);
                    if (dlqVar.k) {
                        hsyVar.fp(274877906944L, true);
                        hsyVar.fp(2048L, false);
                    } else {
                        hsyVar.fp(274877906944L, false);
                        hsyVar.fp(2048L, true);
                    }
                    if (dlqVar.j) {
                        hsyVar.fp(49152L, false);
                    } else {
                        hsyVar.fp(49152L, true);
                    }
                    frameLayout.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
                    int measuredWidth = frameLayout.getMeasuredWidth();
                    int measuredHeight = frameLayout.getMeasuredHeight();
                    frameLayout.layout(0, 0, measuredWidth, measuredHeight);
                    float f = dlqVar.e;
                    a = Bitmap.createBitmap((int) (measuredWidth * f), (int) (measuredHeight * f), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(a);
                    float f2 = dlqVar.e;
                    canvas.scale(f2, f2);
                    frameLayout.draw(canvas);
                    hsyVar.h();
                    Arrays.fill(dlqVar.l, (Object) null);
                    dlqVar.i.d(dlqVar.c(dlqVar.b, this, ibzVar), a, gxo.a(10));
                }
                dlqVar.d(this, a);
            } finally {
                c();
            }
        } else if (!this.d) {
            ((ltd) ((ltd) dlq.a.b()).k("com/google/android/apps/inputmethod/libs/keyboard/KeyboardPreviewRenderer$RenderTask", "onKeyboardReady", 632, "KeyboardPreviewRenderer.java")).t("Re-request keyboard");
            e(ibzVar);
        }
    }

    public final void e(ibz ibzVar) {
        hjg.q();
        hox n = this.h.n(this.b);
        if (n != null) {
            n.ak(ibzVar, this);
        }
    }
}
