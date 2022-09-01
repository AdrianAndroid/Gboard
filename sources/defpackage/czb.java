package defpackage;

import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PG */
/* renamed from: czb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class czb implements ihr {
    private final /* synthetic */ int c;
    public static final /* synthetic */ czb b = new czb(1);
    public static final /* synthetic */ czb a = new czb(0);

    private /* synthetic */ czb(int i) {
        this.c = i;
    }

    @Override // defpackage.ihr
    public final ihs a(iij iijVar) {
        if (this.c == 0) {
            JSONArray jSONArray = new JSONObject(iijVar.e.A()).getJSONArray("results");
            llk e = llp.e();
            for (int i = 0; i < jSONArray.length(); i++) {
                e.h(jSONArray.getString(i));
            }
            return czc.b(e.g(), iijVar);
        }
        JSONObject jSONObject = new JSONObject(iijVar.e.A());
        String optString = jSONObject.optString("locale");
        JSONArray jSONArray2 = jSONObject.getJSONArray("tags");
        llk e2 = llp.e();
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
            nfh t = cyc.d.t();
            String string = jSONObject2.getString("name");
            if (t.c) {
                t.cD();
                t.c = false;
            }
            string.getClass();
            ((cyc) t.b).a = string;
            String string2 = jSONObject2.getString("image");
            if (t.c) {
                t.cD();
                t.c = false;
            }
            string2.getClass();
            ((cyc) t.b).b = string2;
            String string3 = jSONObject2.getString("searchterm");
            if (t.c) {
                t.cD();
                t.c = false;
            }
            string3.getClass();
            ((cyc) t.b).c = string3;
            e2.h((cyc) t.cz());
        }
        return cyg.b(optString, e2.g(), iijVar);
    }
}
