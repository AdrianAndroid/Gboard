package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;
import com.google.android.libraries.inputmethod.keyboard.impl.KeyboardViewHolder;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: eco  reason: default package */
/* loaded from: classes.dex */
public final class eco extends cum {
    public final View A;
    public float B = 1.0f;
    public int C;
    private final ImageView D;
    private final eck E;
    private final float F;
    private final boolean G;
    public final EmojiView s;
    public final ecn u;
    public final Context v;
    public final RecyclerView w;
    public final hcv x;
    public final AtomicBoolean y;
    public final float z;

    public eco(View view, ecn ecnVar, eck eckVar, RecyclerView recyclerView, AtomicBoolean atomicBoolean, boolean z, float f, float f2) {
        super(view);
        this.s = (EmojiView) aad.q(view, R.id.f65200_resource_name_obfuscated_res_0x7f0b0745);
        this.D = (ImageView) aad.q(view, R.id.f130440_resource_name_obfuscated_res_0x7f0b21e6);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(view.getContext(), (int) R.style.f192250_resource_name_obfuscated_res_0x7f150228);
        this.v = contextThemeWrapper;
        this.u = ecnVar;
        this.E = eckVar;
        this.w = recyclerView;
        this.y = atomicBoolean;
        this.G = z;
        this.z = f;
        this.F = f2;
        buw buwVar = new buw(this, ecnVar, eckVar, 6);
        hcp hcpVar = new hcp(contextThemeWrapper);
        this.x = hcpVar;
        hcpVar.c = buwVar;
        KeyboardViewHolder keyboardViewHolder = null;
        if (recyclerView != null) {
            ViewParent parent = recyclerView.getParent();
            while (true) {
                if (parent == null) {
                    break;
                } else if (!(parent instanceof KeyboardViewHolder)) {
                    parent = parent.getParent();
                } else {
                    keyboardViewHolder = (KeyboardViewHolder) parent;
                    break;
                }
            }
        }
        this.A = keyboardViewHolder;
    }

    @Override // defpackage.cum
    public final /* bridge */ /* synthetic */ void F(Object obj, int i) {
        ecz eczVar = (ecz) obj;
        EmojiView emojiView = this.s;
        eck eckVar = this.E;
        String a = eczVar.a();
        String i2 = eckVar.f.i(a);
        if (i2 != null) {
            a = i2;
        } else {
            String str = (String) eckVar.h.get(a);
            if (str != null) {
                a = str;
            }
        }
        emojiView.d(hei.b(a, i, -1, -1));
        if (this.F != this.s.getAlpha()) {
            this.s.setAlpha(this.F);
        }
        this.C = i;
        eck eckVar2 = this.E;
        String[] strArr = (String[]) eckVar2.m.b(eckVar2.f.g().a(eczVar.a()), eckVar2.l).toArray(new String[0]);
        if (this.G && strArr.length > 1) {
            this.s.b = strArr;
            this.D.setImageDrawable(this.v.getDrawable(R.drawable.f49130_resource_name_obfuscated_res_0x7f080298));
            this.D.setVisibility(0);
        } else {
            this.s.b = null;
            this.D.setImageDrawable(null);
            this.D.setVisibility(8);
        }
        this.s.e(new ecm(this, i));
    }

    @Override // defpackage.cum
    public final void G() {
        this.x.b();
        this.s.e(null);
    }
}
