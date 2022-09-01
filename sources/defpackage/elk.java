package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.inputmethod.libs.search.widget.SuggestionListRecyclerView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: elk  reason: default package */
/* loaded from: classes.dex */
public final class elk extends ls {
    public llp d = llp.q();
    public opu e;
    private final Context f;

    public elk(Context context) {
        this.f = context;
    }

    @Override // defpackage.ls
    public final mo d(ViewGroup viewGroup, int i) {
        return new ell(LayoutInflater.from(this.f).inflate(R.layout.f146620_resource_name_obfuscated_res_0x7f0e05d6, viewGroup, false));
    }

    @Override // defpackage.ls
    public final int ha() {
        return this.d.size();
    }

    @Override // defpackage.ls
    public final void o(mo moVar, int i) {
        ell ellVar = (ell) moVar;
        String str = (String) this.d.get(i);
        ellVar.t = this.e;
        ellVar.s.setText(str);
        gyz n = hjg.n(ellVar.a.getContext());
        int[] iArr = SuggestionListRecyclerView.S;
        int b = ellVar.b();
        int length = SuggestionListRecyclerView.S.length;
        ColorStateList a = n.a(iArr[b % 7]);
        if (a != null) {
            ellVar.s.setBackgroundTintList(a);
        }
        ellVar.s.setOnClickListener(new eiz(ellVar, str, 13));
    }
}
