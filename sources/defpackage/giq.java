package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.inputmethod.latin.R;
import java.io.File;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: giq  reason: default package */
/* loaded from: classes.dex */
public final class giq extends gir {
    private ArrayList b;

    @Override // defpackage.an
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!B().isFinishing()) {
            Bundle bundle2 = this.m;
            if (bundle2 != null) {
                ArrayList<Integer> integerArrayList = bundle2.getIntegerArrayList("styleIds");
                this.b = integerArrayList;
                if (integerArrayList == null) {
                    this.b = new ArrayList();
                }
                this.m.getBoolean("showPreview");
                this.m.getBoolean("createNeverCreated");
                if (bundle != null && bundle.containsKey("photoFile") && bundle.containsKey("styleIds")) {
                    ArrayList<Integer> integerArrayList2 = bundle.getIntegerArrayList("styleIds");
                    ArrayList arrayList = new ArrayList();
                    int size = integerArrayList2.size();
                    for (int i = 0; i < size; i++) {
                        try {
                            arrayList.add((njs) nfm.w(njs.g, bundle.getByteArray(Integer.toString(integerArrayList2.get(i).intValue()))));
                        } catch (ngd unused) {
                            Log.w("CreateAvatarCreationFgm", "Error parsing sticker pack from store state");
                        }
                    }
                    if (integerArrayList2.size() == arrayList.size()) {
                        bundle.getBoolean("isFrontCamera");
                        jdg.u(fS());
                        jdg.u(integerArrayList2);
                        jdg.u((File) bundle.getSerializable("photoFile"));
                        giw.b();
                        throw null;
                    }
                }
                Context fS = fS();
                ArrayList arrayList2 = this.b;
                jdg.u(fS);
                jdg.u(arrayList2);
                giw.b();
                throw null;
            }
            throw new IllegalStateException("Creation flow must be started with arguments set.");
        }
        return null;
    }

    @Override // defpackage.an
    public final void T() {
        super.T();
        throw null;
    }

    @Override // defpackage.an
    public final void U() {
        super.U();
        B().getWindow().getDecorView().setSystemUiVisibility(5380);
        if (uv.a(fS(), "android.permission.CAMERA") == 0) {
            throw null;
        }
        throw null;
    }

    @Override // defpackage.an
    public final void V(View view, Bundle bundle) {
        ((Toolbar) view.findViewById(R.id.f53700_resource_name_obfuscated_res_0x7f0b013c)).p(new fat(this, 8));
    }

    @Override // defpackage.gir
    public final boolean a() {
        throw null;
    }

    @Override // defpackage.an
    public final void ar(int i, int[] iArr) {
        if (i != 0) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            Toast.makeText(fS(), (int) R.string.f148280_resource_name_obfuscated_res_0x7f140073, 0).show();
            throw null;
        }
        throw null;
    }

    @Override // defpackage.an
    public final void h(Bundle bundle) {
    }
}
