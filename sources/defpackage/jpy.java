package defpackage;

import android.util.JsonWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;

/* compiled from: PG */
/* renamed from: jpy  reason: default package */
/* loaded from: classes.dex */
public final class jpy implements jty {
    private final kcq a;

    public jpy(mkr mkrVar) {
        this.a = kcq.h(mkrVar, "ManifestInstanceFetcher");
    }

    @Override // defpackage.jty
    public final jtv a(juc jucVar) {
        if (jucVar.n().a("manifest_instance") != null) {
            return jtv.c();
        }
        return null;
    }

    @Override // defpackage.jrs
    public final mko b(jsr jsrVar) {
        return this.a.d(jsrVar);
    }

    @Override // defpackage.jty
    public final mko c(final juc jucVar, jtw jtwVar, final File file) {
        return this.a.e(jucVar.o(), new jtn() { // from class: jpx
            @Override // defpackage.jtn
            public final Object a(jrr jrrVar) {
                juc jucVar2 = juc.this;
                File file2 = file;
                try {
                    jqm jqmVar = (jqm) jucVar2.n().a("manifest_instance");
                    if (jqmVar == null) {
                        throw new IllegalArgumentException("Expected extra is not present: manifest_instance");
                    }
                    lyu a = lyu.a();
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        a.d(fileOutputStream);
                        a = lyu.a();
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
                        a.d(outputStreamWriter);
                        JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                        a.d(jsonWriter);
                        jsonWriter.setIndent("  ");
                        jsonWriter.beginObject();
                        jsonWriter.name("packs");
                        jsonWriter.beginArray();
                        for (juc jucVar3 : jqmVar.i()) {
                            jsonWriter.beginObject();
                            jsr o = jucVar3.o();
                            jsonWriter.name("namespace").value(((jrh) o).a);
                            jsonWriter.name("name").value(((jrh) o).b);
                            jsonWriter.name("compressed_size").value(jucVar3.c());
                            jsonWriter.name("size").value(jucVar3.d());
                            jsonWriter.name("verify_sizes").value(jucVar3.m());
                            jsonWriter.name("download_priority").value(jucVar3.a());
                            if (!jucVar3.l().equals(juc.p)) {
                                jsonWriter.name("expiry_date").value(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX", jpn.a).format(jucVar3.l()));
                            }
                            jsonWriter.name("download_urls");
                            jsonWriter.beginArray();
                            llp g = jucVar3.g();
                            int i = ((lrl) g).c;
                            for (int i2 = 0; i2 < i; i2++) {
                                jsonWriter.value((String) g.get(i2));
                            }
                            jsonWriter.endArray();
                            String k = jucVar3.k();
                            if (k != null) {
                                jsonWriter.name("download_packing_scheme");
                                jsonWriter.value(k);
                            }
                            jsonWriter.name("validation_schemes");
                            jsonWriter.beginArray();
                            llp h = jucVar3.h();
                            int i3 = ((lrl) h).c;
                            for (int i4 = 0; i4 < i3; i4++) {
                                jsonWriter.value((String) h.get(i4));
                            }
                            jsonWriter.endArray();
                            mhb.p(jsonWriter, jucVar3.n());
                            jsonWriter.endObject();
                        }
                        jsonWriter.endArray();
                        mhb.p(jsonWriter, jqmVar.d());
                        jsonWriter.endObject();
                        a.close();
                        return jtx.a("manifest-instance://".concat(String.valueOf(String.valueOf(jqmVar.e()))));
                    } finally {
                    }
                } catch (ClassCastException e) {
                    throw new IllegalArgumentException("Unexpected superpack manifest object type", e);
                }
            }
        });
    }

    @Override // defpackage.jsj
    public final String d() {
        return "ManifestInstanceFetcher";
    }
}
