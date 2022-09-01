package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: dmp  reason: default package */
/* loaded from: classes.dex */
public final class dmp extends or {
    final /* synthetic */ Context a;
    final /* synthetic */ int b;
    final /* synthetic */ float c;
    final /* synthetic */ dms d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmp(dms dmsVar, Context context, int i, float f) {
        super(3, 16);
        this.d = dmsVar;
        this.a = context;
        this.b = i;
        this.c = f;
    }

    @Override // defpackage.on
    public final void g(RecyclerView recyclerView, mo moVar) {
        super.g(recyclerView, moVar);
        aad.S(moVar.a, 0.0f);
        if (moVar instanceof dmq) {
            ((dmq) moVar).F();
        }
    }

    @Override // defpackage.on
    public final void h(Canvas canvas, RecyclerView recyclerView, mo moVar, float f, float f2, int i, boolean z) {
        int left;
        if (i == 1) {
            View view = moVar.a;
            ColorDrawable colorDrawable = new ColorDrawable(this.a.getResources().getColor(R.color.f30980_resource_name_obfuscated_res_0x7f0608cd));
            if (f <= 0.0f) {
                colorDrawable.setBounds(view.getRight() + ((int) f), view.getTop(), view.getRight(), view.getBottom());
            } else {
                colorDrawable.setBounds(view.getLeft(), view.getTop(), view.getLeft() + ((int) f), view.getBottom());
            }
            colorDrawable.draw(canvas);
            Drawable a = ur.a(this.a, R.drawable.f50210_resource_name_obfuscated_res_0x7f080339);
            a.setTint(-1);
            int intrinsicHeight = a.getIntrinsicHeight();
            int intrinsicWidth = a.getIntrinsicWidth();
            int top = view.getTop() + ((view.getHeight() - intrinsicHeight) / 2);
            if (f <= 0.0f) {
                left = (view.getRight() - intrinsicWidth) - this.b;
            } else {
                left = view.getLeft() + this.b;
            }
            a.setBounds(left, top, intrinsicWidth + left, intrinsicHeight + top);
            canvas.save();
            canvas.clipRect(colorDrawable.getBounds());
            a.draw(canvas);
            canvas.restore();
        } else if (i == 2 && z) {
            aad.S(moVar.a, this.c);
        }
        super.h(canvas, recyclerView, moVar, f, f2, i, z);
    }

    @Override // defpackage.on
    public final void i(mo moVar, int i) {
        if (i != 2 || !(moVar instanceof dmq)) {
            return;
        }
        ((dmq) moVar).G();
    }

    @Override // defpackage.on
    public final boolean k() {
        return this.d.g;
    }

    @Override // defpackage.on
    public final boolean l() {
        return this.d.f;
    }

    @Override // defpackage.on
    public final boolean m(RecyclerView recyclerView, mo moVar, mo moVar2) {
        return this.d.x(moVar.b(), moVar2.b());
    }

    @Override // defpackage.on
    public final void o(mo moVar) {
        this.d.y(moVar.b());
    }
}
