package defpackage;

import android.content.res.Resources;
import android.util.Log;
import com.caverock.androidsvg.SVGImageView;

/* compiled from: PG */
/* renamed from: bjt  reason: default package */
/* loaded from: classes.dex */
public final class bjt extends bjr {
    final /* synthetic */ SVGImageView c;

    public bjt(SVGImageView sVGImageView) {
        this.c = sVGImageView;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Integer[] numArr = (Integer[]) objArr;
        Resources resources = this.c.getResources();
        int intValue = numArr[0].intValue();
        float a = a(resources);
        ewj ewjVar = bjd.f;
        bjd i = ewjVar.i("res" + intValue, a);
        if (i != null) {
            return i;
        }
        try {
            bjd g = bjd.g(this.c.getContext(), numArr[0].intValue());
            b(g, resources);
            int intValue2 = numArr[0].intValue();
            ewj ewjVar2 = bjd.f;
            ewjVar2.j(g, "res" + intValue2);
            return g;
        } catch (bjv e) {
            Log.e("SVGImageView", String.format("Error loading resource 0x%x: %s", numArr[0], e.getMessage()));
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
