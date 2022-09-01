package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.inputmethod.latin.R;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ilb  reason: default package */
/* loaded from: classes.dex */
public final class ilb extends an implements ikr {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/personaldictionary/preference/PersonalDictionaryWordsFragment");
    private jav ac;
    private final Executor ad = gxo.c(10);
    private final cir ae = new cir(this, 9);
    private ikt b;
    private ikh c;
    private RecyclerView d;
    private View e;

    private final void m() {
        ikt iktVar = this.b;
        if (iktVar == null || this.d == null || this.e == null) {
            return;
        }
        if (iktVar.ha() == 0) {
            this.d.setVisibility(4);
            this.e.setVisibility(0);
            return;
        }
        this.d.setVisibility(0);
        this.e.setVisibility(8);
    }

    @Override // defpackage.an
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jav javVar;
        ap C = C();
        View inflate = layoutInflater.inflate(R.layout.f144000_resource_name_obfuscated_res_0x7f0e04b0, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.f65630_resource_name_obfuscated_res_0x7f0b077e);
        this.d = recyclerView;
        recyclerView.ab(new LinearLayoutManager());
        this.e = inflate.findViewById(R.id.f130290_resource_name_obfuscated_res_0x7f0b21d5);
        this.d.ay(new kb(C));
        Bundle bundle2 = this.m;
        if (bundle2 == null) {
            ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/personaldictionary/preference/PersonalDictionaryWordsFragment", "onCreateView", 127, "PersonalDictionaryWordsFragment.java")).t("Argument language tag is missing.");
        }
        if (bundle2 == null) {
            javVar = jav.d;
        } else {
            javVar = (jav) bundle2.getParcelable("ARG_KEY_LANGUAGE_TAG");
        }
        this.ac = javVar;
        ikh ikhVar = new ikh();
        this.c = ikhVar;
        ikt iktVar = this.b;
        if (iktVar == null) {
            this.b = new ikt(this.c.d(this.ac), ijz.a(C, this.ac), this);
        } else {
            iktVar.x(ikhVar.d(this.ac), ijz.a(C, this.ac));
        }
        this.d.aa(this.b);
        m();
        hqs.f(this.d, C);
        return inflate;
    }

    @Override // defpackage.an
    public final void P(int i, int i2, Intent intent) {
        Uri data;
        ikh ikhVar;
        jav javVar;
        super.P(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i == 1) {
            if (this.b == null || (ikhVar = this.c) == null || (javVar = this.ac) == null) {
                return;
            }
            ikf d = ikhVar.d(javVar);
            ijy a2 = ijz.a(fS(), this.ac);
            this.b.x(d, a2);
            int i3 = 0;
            mcy b = mcy.b(intent.getIntExtra("EXTRA_KEY_UPDATE_TYPE", 0));
            m();
            ieh j = ieh.j();
            ikp ikpVar = ikp.b;
            Object[] objArr = new Object[4];
            objArr[0] = b;
            objArr[1] = this.ac;
            objArr[2] = Integer.valueOf(d.getCount());
            if (a2 != null) {
                i3 = a2.getCount();
            }
            objArr[3] = Integer.valueOf(i3);
            j.e(ikpVar, objArr);
        } else if (i != 2 || (data = intent.getData()) == null) {
        } else {
            if (this.b == null || this.c == null || this.ac == null) {
                ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/personaldictionary/preference/PersonalDictionaryWordsFragment", "readDictionary", 362, "PersonalDictionaryWordsFragment.java")).t("Import failed. PersonalDictionaryWordsFragment is invalid state.");
                return;
            }
            try {
                InputStream a3 = kmo.a(fS(), data);
                int i4 = iko.a;
                if (iko.a(a3, this.c) > 0) {
                    Toast.makeText(fS(), (int) R.string.f159500_resource_name_obfuscated_res_0x7f1405ea, 1).show();
                    this.b.x(this.c.d(this.ac), ijz.a(fS(), this.ac));
                    m();
                    return;
                }
                Toast.makeText(fS(), (int) R.string.f159490_resource_name_obfuscated_res_0x7f1405e9, 1).show();
            } catch (IOException e) {
                ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/inputmethod/personaldictionary/preference/PersonalDictionaryWordsFragment", "readDictionary", (char) 369, "PersonalDictionaryWordsFragment.java")).s();
            }
        }
    }

    @Override // defpackage.an
    public final void Q(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        menuInflater.inflate(R.menu.f147160_resource_name_obfuscated_res_0x7f100006, menu);
        jbt.z(fS(), menu);
    }

    @Override // defpackage.an
    public final void R() {
        ikt iktVar = this.b;
        if (iktVar != null) {
            iktVar.e.close();
            ijy ijyVar = this.b.f;
            if (ijyVar != null) {
                ijyVar.close();
            }
        }
        ikh ikhVar = this.c;
        if (ikhVar != null) {
            ikhVar.close();
        }
        ijl.b().d(this.ae, ila.class);
        ikk.c(fS());
        super.R();
    }

    public final void a(an anVar, ika ikaVar) {
        Bundle bundle = new Bundle();
        ikaVar.a(bundle);
        anVar.Z(bundle);
        anVar.ae(this, 1);
        ((inx) B()).w(anVar, ikb.b(fS(), ikaVar.d));
    }

    @Override // defpackage.an
    public final boolean al(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.f52040_resource_name_obfuscated_res_0x7f0b0045) {
            iky ikyVar = new iky();
            jav javVar = this.ac;
            if (javVar == null) {
                javVar = jav.d;
            }
            a(ikyVar, new ika(-1L, "", "", javVar));
            return true;
        } else if (menuItem.getItemId() == R.id.f52130_resource_name_obfuscated_res_0x7f0b0055) {
            if (this.ac == null) {
                ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/personaldictionary/preference/PersonalDictionaryWordsFragment", "exportZipDictionary", 286, "PersonalDictionaryWordsFragment.java")).t("Failed export personal dictionary, languageTag is null.");
            } else {
                this.ad.execute(new cfy(fS().getApplicationContext(), this.ac, 2));
            }
            return true;
        } else if (menuItem.getItemId() != R.id.f52150_resource_name_obfuscated_res_0x7f0b0058) {
            return false;
        } else {
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.setType("application/zip");
            startActivityForResult(intent, 2);
            return true;
        }
    }

    @Override // defpackage.an
    public final void e(Bundle bundle) {
        super.e(bundle);
        as();
        ijl.b().h(this.ae, ila.class, gyc.b);
    }
}
