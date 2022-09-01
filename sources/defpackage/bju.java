package defpackage;

import android.util.Log;
import com.caverock.androidsvg.SVGImageView;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: bju  reason: default package */
/* loaded from: classes.dex */
public final class bju extends bjr {
    final /* synthetic */ SVGImageView c;

    public bju(SVGImageView sVGImageView) {
        this.c = sVGImageView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.InputStream[]] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        bjd bjdVar;
        Object[] objArr2 = (InputStream[]) objArr;
        try {
            try {
                try {
                    bjdVar = bjd.f(objArr2[0]);
                    b(bjdVar, this.c.getResources());
                    objArr2 = objArr2[0];
                } catch (IOException unused) {
                }
            } catch (bjv e) {
                String message = e.getMessage();
                Log.e("SVGImageView", "Parse error loading URI: " + message);
                bjdVar = null;
                objArr2 = objArr2[0];
            }
            objArr2.close();
            return bjdVar;
        } catch (Throwable th) {
            try {
                objArr2[0].close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        bjd bjdVar = (bjd) obj;
        if (bjdVar != null) {
            this.c.setImageDrawable(new bjq(bjdVar, this.b, null, null, null));
        }
    }
}
