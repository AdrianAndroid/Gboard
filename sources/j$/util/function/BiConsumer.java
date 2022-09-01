package j$.util.function;

/* loaded from: classes3.dex */
public interface BiConsumer<T, U> {

    /* renamed from: j$.util.function.BiConsumer$-CC  reason: invalid class name */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC<T, U> {
    }

    void accept(T t, U u);

    BiConsumer<T, U> andThen(BiConsumer<? super T, ? super U> biConsumer);
}
