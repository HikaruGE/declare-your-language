package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import org.spoofax.jsglr.client.imploder.ImploderAttachment;
import org.spoofax.interpreter.core.Tools;
import java.util.Objects;

@SuppressWarnings("unused") public class Generic_A_initSuper__Arrow extends A_initSuper__Arrow implements IGenericNode
{ 
  public IStrategoTerm aterm;

  public Generic_A_initSuper__Arrow (INodeSource source, IStrategoTerm term) 
  { 
    Objects.requireNonNull(term);
    this.setSourceInfo(source);
    this.aterm = term;
  }

  @Override public <T> T match(Class<T> clazz)
  { 
    return specialize(1).match(clazz);
  }

  @Override public void specializeChildren(int depth)
  { 
    throw new InterpreterException("Operation not supported", "aterm specializer", this);
  }

  @Override public A_initSuper__Arrow specialize(int depth)
  { 
    if(replaced())
    { 
      return (A_initSuper__Arrow)replacement();
    }
    if(aterm instanceof IStrategoAppl)
    { 
      final IStrategoAppl term = (IStrategoAppl)aterm;
      final String name = term.getName();
      final INodeSource source = NodeSource.fromStrategoTerm(term);
      if(name.equals("initSuper") && term.getSubtermCount() == 1)
      { 
        A_initSuper__Arrow replacement = replace(new initSuper_1(source, new Generic_A_Extends(NodeSource.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)).specialize(1)));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
    }
    throw new RewritingException(aterm.toString());
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    return aterm;
  }

  public R_default_Super exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_Class> _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, A_This _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    return specialize(1).exec_default(_1, _2, _3, _4);
  }
}