package defpackage;

import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: my  reason: default package */
/* loaded from: classes2.dex */
public final class my implements TextWatcher {
    final /* synthetic */ SearchView a;

    public my(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        mko K;
        dng dngVar;
        jav[] G;
        mko mkoVar;
        SearchView searchView = this.a;
        TextUtils.isEmpty(searchView.a.getText());
        searchView.v();
        searchView.w();
        searchView.l();
        searchView.n();
        if (searchView.k != null && !TextUtils.equals(charSequence, searchView.n)) {
            ne neVar = searchView.k;
            String obj = charSequence.toString();
            ((dnn) neVar).aE().v(true);
            String trim = obj.trim();
            dne dneVar = (dne) neVar;
            mko mkoVar2 = dneVar.ad;
            if (mkoVar2 != null) {
                mkoVar2.cancel(true);
            }
            if (TextUtils.isEmpty(trim) || dneVar.af.isEmpty() || (dngVar = dneVar.ai) == null) {
                K = kcu.K(llp.q());
            } else {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(kcu.L(dngVar.c));
                mko mkoVar3 = (mko) dngVar.b.get(dngVar.e);
                if (mkoVar3 != null) {
                    arrayList.add(kcu.L(mkoVar3));
                    arrayList2.add(dngVar.e.q());
                }
                for (jav javVar : jav.G()) {
                    if (!javVar.equals(dngVar.e) && (mkoVar = (mko) dngVar.b.get(javVar)) != null) {
                        arrayList.add(kcu.L(mkoVar));
                        arrayList2.add(javVar.q());
                    }
                }
                K = mio.g(mio.g(kcu.Q(arrayList), new crj(dngVar, trim, arrayList2, 2), gxo.a(1)), new cus(dneVar, 7), gxo.a(1));
            }
            dneVar.ad = K;
            mko mkoVar4 = dneVar.ad;
            kcu.U(mkoVar4, new bvo(dneVar, mkoVar4, 11), gyc.b);
        }
        searchView.n = charSequence.toString();
    }
}
