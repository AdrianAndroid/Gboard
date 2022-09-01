package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.stickers.megamode.MegamodeAvatarBannerView;
import com.google.android.libraries.stickers.megamode.MegamodeView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: knz  reason: default package */
/* loaded from: classes.dex */
public final class knz extends ls {
    final List d = new ArrayList();
    public final knk e;
    public final kod f;

    public knz(knk knkVar, kod kodVar) {
        this.e = knkVar;
        this.f = kodVar;
        u(true);
    }

    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ mo d(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            return new kny(this, (MegamodeView) from.inflate(R.layout.f143430_resource_name_obfuscated_res_0x7f0e0463, viewGroup, false));
        }
        return new knx(this, (MegamodeAvatarBannerView) from.inflate(R.layout.f143400_resource_name_obfuscated_res_0x7f0e0460, viewGroup, false));
    }

    @Override // defpackage.ls
    public final int ha() {
        return this.d.size();
    }

    @Override // defpackage.ls
    public final int he(int i) {
        int i2 = ((njs) this.d.get(i)).a;
        throw null;
    }

    @Override // defpackage.ls
    public final long hf(int i) {
        return ((njs) this.d.get(i)).c.hashCode();
    }

    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ void o(mo moVar, int i) {
        moVar.E((njs) this.d.get(i));
    }
}
