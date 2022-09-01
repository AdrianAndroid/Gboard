package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: hbt  reason: default package */
/* loaded from: classes.dex */
public final class hbt extends hcy {
    private static final ltg d = ltg.j("com/google/android/libraries/inputmethod/emoji/picker/EmojiListHolderAdapter");
    private llp e = llp.q();
    private final int f;
    private final int g;
    private final hbf h;
    private final hej i;
    private final View.OnClickListener j;
    private final hdl k;
    private final LayoutInflater l;

    public hbt(int i, int i2, hbf hbfVar, hej hejVar, Context context, View.OnClickListener onClickListener, hdl hdlVar) {
        this.f = i;
        this.g = i2;
        this.h = hbfVar;
        this.i = hejVar;
        this.o = context;
        this.j = onClickListener;
        this.k = hdlVar;
        this.l = LayoutInflater.from(context);
    }

    @Override // defpackage.ls
    public final mo d(ViewGroup viewGroup, int i) {
        View view;
        if (i == hcq.a) {
            return new hcr(viewGroup, this.l, E(viewGroup) / this.f, this.g, this.i);
        }
        if (i == hcw.a) {
            return new hcx(viewGroup, E(viewGroup) / this.f, this.g, this.j);
        }
        if (i == hcs.a) {
            view = this.l.inflate(R.layout.f134120_resource_name_obfuscated_res_0x7f0e007d, viewGroup, false);
        } else if (i == hde.a) {
            view = this.l.inflate(R.layout.f143340_resource_name_obfuscated_res_0x7f0e0456, viewGroup, false);
        } else if (i == hct.a) {
            view = this.l.inflate(R.layout.f134310_resource_name_obfuscated_res_0x7f0e0090, viewGroup, false);
        } else {
            ((ltd) ((ltd) d.c()).k("com/google/android/libraries/inputmethod/emoji/picker/EmojiListHolderAdapter", "onCreateViewHolder", 130, "EmojiListHolderAdapter.java")).t("Update emoji list contains unsupported Item input.");
            View view2 = new View(this.o);
            view2.setLayoutParams(new ViewGroup.LayoutParams(E(viewGroup) / this.f, this.g));
            view = view2;
        }
        return new mo(view);
    }

    @Override // defpackage.ls
    public final int ha() {
        return ((lrl) this.e).c;
    }

    @Override // defpackage.ls
    public final int he(int i) {
        return ((hda) this.e.get(i)).a();
    }

    @Override // defpackage.ls
    public final void o(mo moVar, int i) {
        int he = he(i);
        if (he == hcq.a) {
            hcq hcqVar = (hcq) this.e.get(i);
            hcr hcrVar = (hcr) moVar;
            hcrVar.F(icu.q(hcqVar, hcqVar.c, hcqVar.b, -1, this.h), hcqVar.e);
            D(hcrVar.a, hcqVar);
        } else if (he == hcw.a) {
            hcx hcxVar = (hcx) moVar;
            icu icuVar = ((hcw) this.e.get(i)).b;
            throw null;
        } else if (he == hcs.a) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) moVar.a.findViewById(R.id.f54200_resource_name_obfuscated_res_0x7f0b0188);
            if (appCompatTextView == null) {
                return;
            }
            appCompatTextView.setText(((hcs) this.e.get(i)).c);
        } else if (he != hct.a) {
        } else {
            TextView textView = (TextView) moVar.a.findViewById(R.id.f54440_resource_name_obfuscated_res_0x7f0b01a2);
            textView.setText(((hct) this.e.get(i)).b);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public final void x(llp llpVar) {
        this.e = hyq.p(((has) this.h).a, llpVar, -1, this.k, true, true);
        fc();
    }
}
