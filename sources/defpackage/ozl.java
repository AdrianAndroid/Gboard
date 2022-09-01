package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.core.content.FileProvider;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.stickers.megamode.MegamodeActivity;
import com.google.android.libraries.stickers.megamode.MegamodeFileProvider;
import java.io.File;

/* compiled from: PG */
/* renamed from: ozl  reason: default package */
/* loaded from: classes2.dex */
public final class ozl extends ozs {
    final /* synthetic */ pan a;
    final /* synthetic */ pan b;

    public ozl(pan panVar, pan panVar2) {
        this.a = panVar;
        this.b = panVar2;
    }

    @Override // defpackage.ozs
    public final void b(Object obj) {
        try {
            pan panVar = this.b;
            MegamodeActivity megamodeActivity = ((knu) panVar).a;
            ncw ncwVar = ((knu) panVar).b;
            File file = (File) obj;
            kns knsVar = ((knn) megamodeActivity.k).e;
            String l = kfl.l(ncwVar.a);
            nfh t = mlr.e.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            ((mlr) t.b).a = kcu.u(39);
            mlr mlrVar = (mlr) t.b;
            l.getClass();
            mlrVar.c = l;
            mlrVar.d = kcu.v(15);
            knsVar.a((mlr) t.cz());
            Uri a = FileProvider.a(megamodeActivity, MegamodeFileProvider.d(megamodeActivity), file);
            megamodeActivity.startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").setType(MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(a.toString()))).putExtra("android.intent.extra.STREAM", a).addFlags(1), megamodeActivity.getString(R.string.f158130_resource_name_obfuscated_res_0x7f140509)));
            kns knsVar2 = ((knn) megamodeActivity.k).e;
            String str = ncwVar.a;
            if (kns.b(str)) {
                String l2 = kfl.l(str);
                knsVar2.c(14, l2, str);
                str = l2;
            }
            nfh t2 = mlr.e.t();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            ((mlr) t2.b).a = kcu.u(14);
            mlr mlrVar2 = (mlr) t2.b;
            str.getClass();
            mlrVar2.c = str;
            mlrVar2.d = kcu.v(19);
            knsVar2.a((mlr) t2.cz());
        } finally {
            d();
        }
    }

    @Override // defpackage.ozs
    public final void il(Throwable th) {
        try {
            Log.w("MegamodeActivity", th);
        } finally {
            d();
        }
    }
}
