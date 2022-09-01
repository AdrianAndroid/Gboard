package com.google.android.libraries.stickers.megamode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.fileprovider.CrashResistantFileProvider;
import java.io.File;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MegamodeActivity extends cx implements kod {
    public knk k;
    public int l;
    public knz m;
    private ozu n;
    private RecyclerView o;

    /* JADX WARN: Type inference failed for: r3v2, types: [ozr, java.lang.Object] */
    private final void n(final ncw ncwVar) {
        ozu ozuVar = this.n;
        if (ozuVar != null) {
            ozuVar.d();
        }
        if (!CrashResistantFileProvider.c(this, MegamodeFileProvider.d(this))) {
            Log.e("MegamodeActivity", "File provider is not initialized");
            return;
        }
        mok e = mok.e(new ozo(mok.e(new ozq(mok.e(new pau(mok.e(new paq(new jiz(this, 11), 1)), new pao() { // from class: knt
            @Override // defpackage.pao
            public final Object a(Object obj) {
                ncw ncwVar2 = ncw.this;
                File file = (File) obj;
                int u = ndb.u(ncwVar2.b);
                if (u == 0 || u != 4) {
                    throw new IllegalStateException("AvatarSticker can only render EYCK type sticker.");
                }
                String str = ncwVar2.a;
                int indexOf = str.indexOf(47) + 1;
                int parseInt = Integer.parseInt(str.substring(indexOf, str.indexOf(47, indexOf)));
                String str2 = ncwVar2.a;
                giu.a(parseInt, Integer.parseInt(str2.substring(str2.lastIndexOf(47) + 1))).a();
                throw null;
            }
        }, 0, (byte[]) null, (byte[]) null)), null, null)), pbu.b(), null, null));
        this.n = mok.e(new pau((ozr) e.b, ozx.a.b, 1, (byte[]) null, (byte[]) null)).d(new ozl(knv.a, new knu(this, ncwVar)));
    }

    @Override // defpackage.kod
    public final void l(njs njsVar, njr njrVar, boolean z) {
        ncw j = kfl.j(njsVar, njrVar);
        if (!this.k.a(kfl.k(njsVar.a))) {
            n(j);
            return;
        }
        kns knsVar = ((knn) this.k).e;
        String str = j.a;
        if (kns.b(str)) {
            String l = kfl.l(str);
            knsVar.c(35, l, str);
            str = l;
        }
        nfh t = mlr.e.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mlr) t.b).a = kcu.u(35);
        mlr mlrVar = (mlr) t.b;
        str.getClass();
        mlrVar.c = str;
        mlrVar.d = kcu.v(15);
        knsVar.a((mlr) t.cz());
        Intent intent = new Intent();
        intent.putExtra("avatar_sticker", j.q());
        intent.putExtra("is_pack_icon", z);
        setResult(-1, intent);
        finish();
    }

    @Override // defpackage.kod
    public final void m(njs njsVar, njr njrVar) {
        n(kfl.j(njsVar, njrVar));
    }

    @Override // defpackage.ap, defpackage.ow, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i == 1) {
            this.m.fc();
        } else if (i != 2) {
        } else {
            new ArrayList();
            new ArrayList();
            new ArrayList();
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ap, defpackage.ow, defpackage.cc, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.l = getIntent().getIntExtra("theme_mode", 0);
        setContentView(R.layout.f143410_resource_name_obfuscated_res_0x7f0e0461);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.f65760_resource_name_obfuscated_res_0x7f0b0798);
        this.o = recyclerView;
        getApplicationContext();
        recyclerView.ab(new LinearLayoutManager());
        this.k = ((knl) getApplicationContext()).b();
        ((knl) getApplicationContext()).e();
        ((knn) this.k).g();
        Log.w("ExpressiveStickerClient", "AvatarLibrary is not available for setting up auto-favorite");
        this.m = new knz(this.k, this);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cx, defpackage.ap, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        throw null;
    }
}
