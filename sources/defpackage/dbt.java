package defpackage;

import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: dbt  reason: default package */
/* loaded from: classes.dex */
public final class dbt {
    public static final hhl a = hhq.a("enable_rotate_fake_app_completion", false);
    public static final hhl b = hhq.h("app_completions", "");
    private static final lug f = hin.a;
    public int c;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    private final hhk flagObserver;

    public dbt() {
        a();
        bvl bvlVar = new bvl(this, 9);
        this.flagObserver = bvlVar;
        b.e(bvlVar);
    }

    public final void a() {
        String str = (String) b.c();
        this.d.clear();
        this.e.clear();
        if (str != null && str.length() > 0) {
            try {
                JsonReader jsonReader = new JsonReader(new StringReader(str));
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    this.d.add(iqe.g(jsonReader.nextName()));
                    this.e.add(new dpe(jsonReader, (byte[]) null));
                }
            } catch (IOException e) {
                ((luc) ((luc) ((luc) f.c()).i(e)).k("com/google/android/apps/inputmethod/libs/fakeappcompletion/AppCompletionDataSource", "parseFromJsonString", 191, "AppCompletionDataSource.java")).w("Error parsing app completion info:\n%s", str);
            }
        }
        this.c = 0;
    }
}
