package defpackage;

import android.content.res.Resources;
import android.util.Log;
import com.caverock.androidsvg.SVGImageView;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: bjs  reason: default package */
/* loaded from: classes.dex */
public final class bjs extends bjr {
    final /* synthetic */ SVGImageView c;

    public bjs(SVGImageView sVGImageView) {
        this.c = sVGImageView;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        Resources resources = this.c.getResources();
        bjd i = bjd.f.i(strArr[0], a(resources));
        if (i != null) {
            return i;
        }
        try {
            bjd e = bjd.e(this.c.getContext().getAssets(), strArr[0]);
            b(e, resources);
            bjd.f.j(e, strArr[0]);
            return e;
        } catch (bjv e2) {
            String str = strArr[0];
            String message = e2.getMessage();
            Log.e("SVGImageView", "Error loading file " + str + ": " + message);
            return null;
        } catch (FileNotFoundException unused) {
            Log.e("SVGImageView", "File not found: ".concat(String.valueOf(strArr[0])));
            return null;
        } catch (IOException e3) {
            Log.e("SVGImageView", "Unable to load asset file: ".concat(String.valueOf(strArr[0])), e3);
            return null;
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
