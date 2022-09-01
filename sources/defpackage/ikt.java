package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ikt  reason: default package */
/* loaded from: classes.dex */
public final class ikt extends ls {
    private static final ltg g = ltg.j("com/google/android/libraries/inputmethod/personaldictionary/PersonalDictionaryWordsAdapter");
    public final ikr d;
    public ikf e;
    public ijy f;

    public ikt(ikf ikfVar, ijy ijyVar, ikr ikrVar) {
        this.e = ikfVar;
        this.f = ijyVar;
        this.d = ikrVar;
    }

    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ mo d(ViewGroup viewGroup, int i) {
        return new iks(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f144010_resource_name_obfuscated_res_0x7f0e04b1, viewGroup, false));
    }

    @Override // defpackage.ls
    public final int ha() {
        int count = this.e.getCount();
        ijy ijyVar = this.f;
        return count + (ijyVar == null ? 0 : ijyVar.getCount());
    }

    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ void o(mo moVar, int i) {
        ika ikaVar;
        ika ikaVar2;
        iks iksVar = (iks) moVar;
        if (i < this.e.getCount()) {
            if (this.e.moveToPosition(i)) {
                ikaVar2 = this.e.b();
            } else {
                ((ltd) g.a(hip.a).k("com/google/android/libraries/inputmethod/personaldictionary/PersonalDictionaryWordsAdapter", "onBindViewHolder", 65, "PersonalDictionaryWordsAdapter.java")).t("Failed to load database entry.");
                ikaVar2 = new ika(-1L, "", "", jav.d);
            }
            iksVar.G(ikaVar2.b);
            iksVar.F(ikaVar2.c);
            iksVar.a.setOnClickListener(new ikq(this, ikaVar2, 1));
            return;
        }
        ijy ijyVar = this.f;
        if (ijyVar == null || !ijyVar.moveToPosition(i - this.e.getCount())) {
            ((ltd) g.a(hip.a).k("com/google/android/libraries/inputmethod/personaldictionary/PersonalDictionaryWordsAdapter", "onBindViewHolder", 77, "PersonalDictionaryWordsAdapter.java")).t("Failed to load database entry.");
            ikaVar = new ika(-1L, "", "", jav.d);
        } else {
            ikaVar = this.f.b();
        }
        iksVar.G(ikaVar.b);
        iksVar.F(ikaVar.c);
        iksVar.a.setOnClickListener(new ikq(this, ikaVar, 0));
    }

    public final void x(ikf ikfVar, ijy ijyVar) {
        this.e.close();
        this.e = ikfVar;
        ijy ijyVar2 = this.f;
        if (ijyVar2 != null) {
            ijyVar2.close();
        }
        this.f = ijyVar;
        fc();
    }
}
